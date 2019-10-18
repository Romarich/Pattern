package ex4etudiants.src;

public class MachineACafe {
	private enum Etat{
		IDLE{
			public void rendreMonnaie(MachineACafe m){
			}
			
			public void selectionnerBoisson(MachineACafe m,ToucheBoisson toucheBoisson) {
				m.afficherPasAssez(toucheBoisson);
			}
			public void entrerMonnaie(MachineACafe m ,Piece piece) {
				m.etatCourant = COLLECTE;
			}
						
		},COLLECTE{
			public void entrerMonnaie(MachineACafe m ,Piece piece) {}
		},PAS_ASSEZ{
			public void selectionnerBoisson(MachineACafe m,ToucheBoisson toucheBoisson) {
				throw new IllegalStateException();
			}
			
			public void entrerMonnaie(MachineACafe m ,Piece piece) {
				if(m.boisson.getPrix() > m.montantEnCours) {
					m.afficherPasAssez(m.boisson);
				} else {
					m.montantEnCours -= m.boisson.getPrix();
					m.afficherBoisson(m.boisson);
					m.boisson = null;
					m.afficherMontant();
					if (m.montantEnCours == 0)
						m.etatCourant =  IDLE;
					else
						m.etatCourant =  COLLECTE;
				}
			}
			
		};
		
		public void rendreMonnaie(MachineACafe m) {
			m.afficherRetour();
			m.montantEnCours = 0;
			m.boisson = null;
			m.etatCourant = IDLE;
		}
		
		public void selectionnerBoisson(MachineACafe m,ToucheBoisson toucheBoisson) {
			if (toucheBoisson.getPrix() > m.montantEnCours) {
				m.boisson = toucheBoisson;
				m.afficherPasAssez(m.boisson);
				m.boisson = toucheBoisson;
				m.etatCourant =  PAS_ASSEZ;
				return;
			}
			m.montantEnCours -= toucheBoisson.getPrix();
			m.afficherBoisson(toucheBoisson);
			m.afficherMontant();
			if (m.montantEnCours == 0)
				m.etatCourant =IDLE;
			else
				m.etatCourant = COLLECTE;
		}
		
		public void entrerMonnaie(MachineACafe m ,Piece piece) {
			m.etatCourant = COLLECTE;
		}
	}
	
	private int montantEnCours = 0;
	private Etat etatCourant = Etat.IDLE;
	private ToucheBoisson boisson = null;
	
	public void afficherMontant() {
		System.out.println(montantEnCours + " cents disponibles");
	}
	
	public void afficherRetour() {
		System.out.println(montantEnCours + " cents rendus");
	}
	
	public void afficherPasAssez(ToucheBoisson toucheBoisson) {
		System.out.println("Vous n'avez pas introduit un montant suffisant pour un " + toucheBoisson);
		System.out.println("Il manque encore " + (toucheBoisson.getPrix() - montantEnCours) + " cents");
	}

	public void afficherBoisson(ToucheBoisson toucheBoisson) {
		System.out.println("Voici un " + toucheBoisson);
		
	}

	public void entrerMonnaie(Piece piece) {
		montantEnCours += piece.getValeur();
		afficherMontant();
		etatCourant.entrerMonnaie(this,piece);
	}
	
	public void selectionnerBoisson(ToucheBoisson toucheBoisson) {
		etatCourant.selectionnerBoisson(this, toucheBoisson);	
	}
	
	public void rendreMonnaie() {
		etatCourant.rendreMonnaie(this);
	}
}

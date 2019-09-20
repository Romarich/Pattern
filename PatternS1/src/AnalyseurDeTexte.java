import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AnalyseurDeTexte {
	ArrayList<Observer> listeObserv = new ArrayList<Observer>();
	
	public void lireFichier(String nomFichier) throws IOException {
		BufferedReader lecteurAvecBuffer = null;
		String ligne;
		try {
			lecteurAvecBuffer = new BufferedReader(new FileReader(nomFichier));
		} catch (FileNotFoundException e) {
			System.out.println("Erreur d'ouverture");
		}
		while ((ligne = lecteurAvecBuffer.readLine()) != null) {
			for(Observer o : listeObserv){
				o.notifier(ligne);
			}
		}
		lecteurAvecBuffer.close();
	}
	
	public void ajoutObserver(Observer o) {
		listeObserv.add(o);
	}
}

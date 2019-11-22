package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;

public abstract class Generateur /*HANDLER*/{
	private Generateur gen;
	public abstract boolean valider(String numero);
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(gen == null) {
			throw new RuntimeException();
		}
		return gen.creerCarte(numero, dateExpiration, nom);
	}
}

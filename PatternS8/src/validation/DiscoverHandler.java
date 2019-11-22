package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;
import domaine.Discover;
import domaine.Visa;

public class DiscoverHandler extends Generateur{

	@Override
	public boolean valider(String numero) {
		return (numero.startsWith("6011") || numero.startsWith("65")) && numero.length()==16;
	}

	@Override
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new Discover(numero,dateExpiration,nom);
		}else {
			return super.creerCarte(numero,dateExpiration,nom);
		}
	}

}

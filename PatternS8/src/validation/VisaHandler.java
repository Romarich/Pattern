package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;
import domaine.Visa;

public class VisaHandler extends Generateur{

	@Override
	public boolean valider(String numero) {
		return numero.startsWith("4") && numero.length()==16;
	}

	@Override
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new Visa(numero,dateExpiration,nom);
		}else {
			return super.creerCarte(numero,dateExpiration,nom);
		}
		
	}

}

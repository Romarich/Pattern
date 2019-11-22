package validation;

import java.util.Calendar;

import domaine.AmEx;
import domaine.CarteDeCredit;
import domaine.Visa;

public class AmExHandler extends Generateur{

	@Override
	public boolean valider(String numero) {
		return numero.length() == 15 && (numero.startsWith("34") || numero.startsWith("37"));
	}

	@Override
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new AmEx(numero,dateExpiration,nom);
		}else {
			return super.creerCarte(numero,dateExpiration,nom);
		}
	}

}

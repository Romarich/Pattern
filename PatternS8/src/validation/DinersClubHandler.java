package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;
import domaine.DinersClub;
import domaine.Visa;

public class DinersClubHandler extends Generateur {

	@Override
	public boolean valider(String numero) {
		return numero.startsWith("36") && numero.length() == 14;
	}

	@Override
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new DinersClub(numero,dateExpiration,nom);
		}else {
			return super.creerCarte(numero,dateExpiration,nom);
		}
	}

}

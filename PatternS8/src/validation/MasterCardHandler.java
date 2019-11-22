package validation;

import java.util.Calendar;

import domaine.CarteDeCredit;
import domaine.MasterCard;
import domaine.Visa;

public class MasterCardHandler extends Generateur {

	@Override
	public boolean valider(String numero) {
		return (numero.startsWith("51") || numero.startsWith("52") || numero.startsWith("53") || numero.startsWith("54") || numero.startsWith("55")) && numero.length()==16;
	}

	@Override
	public CarteDeCredit creerCarte(String numero, Calendar dateExpiration, String nom) {
		if(valider(numero)) {
			return new MasterCard(numero,dateExpiration,nom);
		}else {
			return super.creerCarte(numero,dateExpiration,nom);
		}
	}

}

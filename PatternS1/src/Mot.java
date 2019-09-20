
public class Mot implements Observer{

	private int nombreDeFoisMot = 0;
	@Override
	public void notifier(String ligne) {
		for (String mot : ligne.trim().split(" ")) {
			nombreDeFoisMot++;
		}
	}
	public int count() {
		return nombreDeFoisMot;
	}

}

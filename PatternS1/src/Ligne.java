
public class Ligne implements Observer {

	private int nombreDeFoisLigne = 0;
	public int count() {
		return nombreDeFoisLigne;
	}
	@Override
	public void notifier(String ligne) {
		nombreDeFoisLigne++;
	}

}

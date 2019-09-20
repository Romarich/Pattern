
public class Belgique implements Observer {

	private int nombreDeFoisBelgique = 0;
	@Override
	public void notifier(String ligne) {
		if (ligne.contains("Belgique")) {
			nombreDeFoisBelgique++;
		}
	}
	public int count() {
		return nombreDeFoisBelgique;
	}

}

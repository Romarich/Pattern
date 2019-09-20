
public class Palindrome implements Observer{

	private int nombreDeFoisPalindrome = 0;
	@Override
	public void notifier(String ligne) {
		for (String mot : ligne.trim().split(" ")) {
			StringBuffer temp = new StringBuffer(mot);
			if (mot.equals(temp.reverse().toString())) {
				nombreDeFoisPalindrome++;
			}
		}
		
	}
	public int count() {
		return nombreDeFoisPalindrome;
	}

}

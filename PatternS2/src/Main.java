import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
	private static String fichier;
	
	public static void main(String[] args) throws IOException {
		if (args.length == 0) {
			System.out.println("Usage : java ListerMots fichier");
			System.exit(1);
		}
		
		fichier = args[0];
		
		ListeMot l = new ListeMot(fichier);
		l.affiche(new Palindrome());
		l.affiche(new CommenceParT());
		l.affiche(new TailleMotSpecifique(5));
		l.affiche(new And(new CommenceParT(), new TailleMotSpecifique(5)));
		l.affiche(new Not(new CommenceParT()));
		
	}
}
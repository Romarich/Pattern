import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
			
			
			Observer belgiqueObserver = new Belgique();
			Observer ligneObserver = new Ligne();
			Observer motObserver = new Mot();
			Observer palindromeObserver = new Palindrome();
			
			AnalyseurDeTexte analy = new AnalyseurDeTexte();
			analy.ajoutObserver(belgiqueObserver);
			analy.ajoutObserver(ligneObserver);
			analy.ajoutObserver(motObserver);
			analy.ajoutObserver(palindromeObserver);
			analy.lireFichier("textetest3.txt");
			
			System.out.println("Il y avait " + ligneObserver.count()  + " lignes.");
			System.out.println("Il y avait " + motObserver.count() + " mots.");
			System.out.println("Il y avait " + palindromeObserver.count()+ " palindromes.");
			System.out.println("Il y avait " + belgiqueObserver.count() + " lignes contenant Belgique.");
		}
	}

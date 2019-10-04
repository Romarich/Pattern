import java.io.*;
import java.util.StringTokenizer;

public class Palindrome implements Strategy{ // mal foutu

	public boolean execute(String mot) throws IOException {
		return estPalindrome(mot);
	}

	public boolean estPalindrome(String mot) {
		if (mot == null)
			return false;
		StringBuffer stringbuffer = new StringBuffer(mot);
		return mot.equals(stringbuffer.reverse().toString());
	}
}

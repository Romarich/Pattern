import java.io.*;
import java.util.*;

public class TailleMotSpecifique implements Strategy{ // mal foutu
	private int longueur;
	
	public TailleMotSpecifique(int longueur) {
		super();
		this.longueur = longueur;
	}

	public boolean execute(String mot) throws IOException {
		return mot.length() == this.longueur;
	}
}

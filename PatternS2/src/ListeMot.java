import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ListeMot implements Strategy{
	private Strategy decoratedStrategy;
	private int compteur;
	public List<String> list;
	private BufferedReader input;
	
	
	public ListeMot(String fichier) throws IOException {
		list= new ArrayList<String>();
		input = new BufferedReader(new FileReader(fichier));
		String buffer = null;
		while ((buffer = input.readLine()) != null) {
			StringTokenizer mots = new StringTokenizer(buffer, " \t.;(){}\"'*=:!/\\");
			while (mots.hasMoreTokens()) {
				String mot = mots.nextToken();
				list.add(mot);
			}
		}
		this.compteur = 0;
	}
	
	public void affiche(Strategy s) throws IOException {
		for(String mot : list) {
			if(s.execute(mot)) System.out.println(mot);
		}
	}

	@Override
	public boolean execute(String mot) throws IOException {
		if(decoratedStrategy.execute(mot)) {
			compteur++;
			return true;
		} 
		return false;
	}

}

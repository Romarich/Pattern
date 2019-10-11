package ex3AAbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class Magasin {
	private Map<String,Article> bac= new HashMap<String,Article>();
	
	public Article ajouterArticle(IArticle a, String name, int anneeDeParution) {
		return a.createArticle(name, anneeDeParution);
	}
	
	public Article retourneArticle(String name){
		return bac.get(name);
	}
}

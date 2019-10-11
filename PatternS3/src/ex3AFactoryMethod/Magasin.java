package ex3AFactoryMethod;

import java.util.HashMap;
import java.util.Map;

public abstract class Magasin {
	public abstract Article createArticle(String name, int anneeDeParution);
	private Map<String,Article> bac= new HashMap<String,Article>();
	
	public void ajouterArticle(String name, int anneeDeParution){
		Article article=this.createArticle(name,anneeDeParution);
		bac.put(name,article);
	}
	
	public Article retourneArticle(String name){
		return bac.get(name);
	}
}

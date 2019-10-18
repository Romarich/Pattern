package ex3AAbstractFactory;

import java.util.HashMap;
import java.util.Map;

public class Magasin {
	private Map<String,Article> bac= new HashMap<String,Article>();
	private IArticle factory;
	
	public Magasin(IArticle factory) {
		if(factory==null) throw new IllegalArgumentException();
		this.factory = factory;
	}
	
	public void ajouterArticle(String name, int anneeDeParution) {
		bac.put(name,factory.createArticle(name, anneeDeParution));
	}
	
	public Article retourneArticle(String name){
		return bac.get(name);
	}
}

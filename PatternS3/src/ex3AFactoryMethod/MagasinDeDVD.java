package ex3AFactoryMethod;
import java.util.HashMap;
import java.util.Map;


public class MagasinDeDVD extends Magasin{
	
	@Override
	public Article createArticle(String name, int anneeDeParution) {
		return new DVD(name,anneeDeParution);
	}
}

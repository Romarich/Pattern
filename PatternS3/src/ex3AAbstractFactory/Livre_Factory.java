package ex3AAbstractFactory;

public class Livre_Factory implements IArticle {

	@Override
	public Article createArticle(String name, int anneeDeParution) {
		return new Livre(name,anneeDeParution);
	}
}

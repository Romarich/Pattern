package ex3AAbstractFactory;

public class DVD_Factory implements IArticle{

	@Override
	public Article createArticle(String name, int anneeDeParution) {
		return new DVD(name,anneeDeParution);
	}
}

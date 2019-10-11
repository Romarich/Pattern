package ex3AFactoryMethod;

public class DVD extends Article {
	public static final double PRIX=19.99;
	
	public DVD(String name,int anneeParution) {
		this.name=name;
		this.anneeDeParution=anneeDeParution;
		this.prix=PRIX;
	}
}

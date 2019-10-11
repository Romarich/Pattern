package ex3AFactoryMethod;
public class Livre extends Article{
	public static final double PRIX=14.99;
	
	public Livre(String name, int anneeDeParution){
		this.name=name;
		this.anneeDeParution=anneeDeParution;
		this.prix=PRIX;
	}
}
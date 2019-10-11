package ex3AFactoryMethod;

public abstract class Article {

	protected String name;
	protected int anneeDeParution;
	protected double prix;
	
	public String getName() {
		return name;
	}
	public int getAnneeDeParution() {
		return anneeDeParution;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(int prix){
		this.prix=prix;
	}

}

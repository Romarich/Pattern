package ex3AAbstractFactory;

public class DVD implements Article{
	public static final double PRIX=19.99;
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
	
	public DVD(String name, int anneeDeParution){
		this.name=name;
		this.anneeDeParution=anneeDeParution;
		this.prix=PRIX;
	}
}

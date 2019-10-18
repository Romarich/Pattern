package ex3AAbstractFactory;

public class Main {
	public static void main(String[] args) {
		Magasin dvdMag = new Magasin(new DVD_Factory());
		Magasin livreMag = new Magasin(new Livre_Factory());
		
		dvdMag.ajouterArticle("P1", 2000);
		dvdMag.ajouterArticle("P2", 2001);
		livreMag.ajouterArticle("P3", 2002);
		livreMag.ajouterArticle("P4", 2003);
		
		System.out.println(dvdMag.retourneArticle("P1").getPrix());
		System.out.println(livreMag.retourneArticle("P3").getPrix());
	}
}

package ex3AFactoryMethod;

public class Main {
	public static void main(String[] args) {
		MagasinDeDVD dvdMag = new MagasinDeDVD();
		MagasinDeLivre livreMag = new MagasinDeLivre();
		
		dvdMag.ajouterArticle("P1", 2000);
		dvdMag.ajouterArticle("P2", 2001);
		livreMag.ajouterArticle("P3", 2002);
		livreMag.ajouterArticle("P4", 2003);
		
		System.out.println(dvdMag.retourneArticle("P1"));
		System.out.println(livreMag.retourneArticle("P3"));
	}
}

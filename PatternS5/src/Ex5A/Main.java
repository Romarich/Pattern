package Ex5A;

public class Main {

	public static void main(String[] args) {
		Album lonerism = new Album.AlbumBuilder("Lonerism", "Tame Impala").paysArtiste("Australie").anneeParution(2012).genre("indie rock").build(); 
		Album orange = new Album.AlbumBuilder("channel ORANGE","Frank Ocean").anneeParution(2012).genre("R&B").build();
		Album visions = new Album.AlbumBuilder("Visions","Grimes").anneeParution(2012).labelMarqueDeDisque("4AD").genre("Electronic").build();

	}

}

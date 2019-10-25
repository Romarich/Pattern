package Ex5A;

public class Album {
	private final String titre;
	private final String nomArtiste;
	private final String labelMarqueDeDisque;
	private final String producteur;
	private final String paysArtiste;
	private final String version;
	private final String genre;
	private final int anneeParution;
	private final boolean albumRemasterise;
	private final int anneeParutionOriginal;
	private final int debitStandard;
	private final int debitAbonne;

	public String getTitre() {
		return titre;
	}

	public String getNomArtiste() {
		return nomArtiste;
	}

	public String getLabelMarqueDeDisque() {
		return labelMarqueDeDisque;
	}

	public String getProducteur() {
		return producteur;
	}

	public String getPaysArtiste() {
		return paysArtiste;
	}

	public String getVersion() {
		return version;
	}

	public String getGenre() {
		return genre;
	}

	public int getAnneeParution() {
		return anneeParution;
	}

	public boolean isAlbumRemasterise() {
		return albumRemasterise;
	}

	public int getAnneeParutionOriginal() {
		return anneeParutionOriginal;
	}

	public int getDebitStandard() {
		return debitStandard;
	}

	public int getDebitAbonne() {
		return debitAbonne;
	}

	private Album(AlbumBuilder b) {
		this.labelMarqueDeDisque = b.labelMarqueDeDisque;
		this.producteur = b.producteur;
		this.albumRemasterise = b.albumRemasterise;
		this.anneeParution = b.anneeParution;
		this.anneeParutionOriginal = b.anneeParutionOriginal;
		this.debitAbonne = b.debitAbonne;
		this.debitStandard = b.debitStandard;
		this.genre = b.genre;
		this.nomArtiste = b.nomArtiste;
		this.paysArtiste = b.paysArtiste;
		this.titre = b.titre;
		this.version = b.version;
	}
	
	public static class AlbumBuilder{
		private final String titre;
		private final String nomArtiste;
		private String labelMarqueDeDisque;
		private String producteur;
		private String paysArtiste;
		private String version;
		private String genre;
		private int anneeParution;
		private boolean albumRemasterise;
		private int anneeParutionOriginal;
		private int debitStandard;
		private int debitAbonne;
		
		public AlbumBuilder(String titre, String nomArtiste) {
			this.titre = titre;
			this.nomArtiste = nomArtiste;
		}
		
		public AlbumBuilder labelMarqueDeDisque(String labelMarqueDeDisque) {
			this.labelMarqueDeDisque = labelMarqueDeDisque;
			return this;
		}
		
		public AlbumBuilder producteur(String producteur) {
			this.producteur = producteur;
			return this;
		}
		
		public AlbumBuilder paysArtiste(String paysArtiste) {
			this.paysArtiste = paysArtiste;
			return this;
		}
		
		public AlbumBuilder version(String version) {
			this.version = version;
			return this;
		}
		
		public AlbumBuilder genre(String genre) {
			this.genre = genre;
			return this;
		}
		
		public AlbumBuilder anneeParution(int anneeParution) {
			this.anneeParution = anneeParution;
			return this;
		}
		
		public AlbumBuilder albumRemasterise(boolean albumRemasterise) {
			this.albumRemasterise = albumRemasterise;
			return this;
		}
		
		public AlbumBuilder anneeParutionOriginal(int anneeParutionOriginal) {
			this.anneeParutionOriginal = anneeParutionOriginal;
			return this;
		}
		
		public AlbumBuilder debitStandard(int debitStandard) {
			this.debitStandard = debitStandard;
			return this;
		}
		
		public AlbumBuilder debitAbonne(int debitAbonne) {
			this.debitAbonne = debitAbonne;
			return this;
		}
		
		public Album build() {
			Album aRenvoye = new Album(this);
			if(aRenvoye.isAlbumRemasterise() && (aRenvoye.anneeParutionOriginal==0 || aRenvoye.debitStandard==0 || aRenvoye.debitAbonne==0)) {
				throw new IllegalArgumentException("Soucis avec annee de parution");
			}
			return aRenvoye;
		}
	}
}




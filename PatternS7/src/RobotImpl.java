public class RobotImpl implements Robot {
	private final String nomRobot;
	private final int puissanceCanon;
	private int pointDeVie;
	private final int bouclier;
	private final int frequenceDeTir;
	
	private RobotImpl(RobotBuilder builder) {
		this.nomRobot = builder.nomRobot;
		this.pointDeVie = builder.pointDeVie;
		this.puissanceCanon = builder.puissanceCanon;
		this.bouclier = builder.bouclier;
		this.frequenceDeTir = builder.frequenceDeTir;
	}
	
	@Override
	public int getCanon() {
		return this.puissanceCanon;
	}
	@Override
	public int getShield() {
		return this.bouclier;
	}
	@Override
	public int getFreq() {
		return this.frequenceDeTir;
	}
	@Override
	public String getName() {
		return nomRobot;
	}
	@Override
	public int diffLife(int i) {
		this.pointDeVie += i; 
		return pointDeVie;
	}
	
	public static class RobotBuilder {
		private int puissanceCanon;
		private int bouclier;
		private int frequenceDeTir;
		private String nomRobot;
		private int pointDeVie;
		
		public RobotBuilder(String nomRobot) {
			this.nomRobot = nomRobot;
			this.pointDeVie = 100;
		}
		
		public RobotBuilder puissanceCanon(int puissanceCanon) {
            this.puissanceCanon = puissanceCanon;
            return this;
        }
        public RobotBuilder bouclier(int bouclier) {
            this.bouclier = bouclier;
            return this;
        }
        public RobotBuilder frequenceDeTir(int frequenceDeTir) {
            this.frequenceDeTir = frequenceDeTir;
            return this;
        }
        
        public RobotImpl build() {
        	return new RobotImpl(this);        	        
        }


	}
}
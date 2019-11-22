public class RobotImpl implements Robot, Cloneable{
	
	private int hp;
	private final int canon;
	private final int shield;
	private final int freq;
	private final String name;
	
	private RobotImpl(BuilderRobot rb) {
		this.hp = rb.hp;
		this.canon = rb.canon;
		this.shield = rb.shield;
		this.freq = rb.freq;
		this.name = rb.name;
	}
	public Object clone()throws CloneNotSupportedException{  
		return (Robot)super.clone();  
	   }
	
	@Override
	public int getCanon() {
		// TODO Auto-generated method stub
		return this.canon;
	}

	@Override
	public int getShield() {
		// TODO Auto-generated method stub
		return this.shield;
	}

	@Override
	public int getFreq() {
		// TODO Auto-generated method stub
		return this.freq;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	public int getHp() {
		// TODO Auto-generated method stub
		return this.hp;
	}
	
	@Override
	public int diffLife(int i) {
		this.hp += i;
		return this.hp;
	}
	
	static class BuilderRobot {

		private int hp;
		private int canon;
		private int shield;
		private int freq;
		private final String name;
		
		public BuilderRobot(String name) {
			this.hp = 100;
			this.canon = 1;
			this.freq = 100;
			this.shield = 1;
			this.name = name;
		}
		
		public BuilderRobot hp(int hp) {
			this.hp = hp;
			return this;
		}
		
		public BuilderRobot canon(int canon) {
			this.canon = canon;
			return this;
		}
		public BuilderRobot freq(int freq) {
			this.freq = freq;
			return this;
		}
		public BuilderRobot shield(int shield) {
			this.shield = shield;
			return this;
		}
		
		public Robot build() {
			return new RobotImpl(this);
		}
	}

}

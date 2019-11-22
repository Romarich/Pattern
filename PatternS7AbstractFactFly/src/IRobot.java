
public class IRobot implements Robot, Cloneable{

	private Robot robotImpl;
	private int multCanon;
	private int multShield;
	private int multFreq;
	
	public IRobot(Robot robotImpl, int mC, int mS, int mF) {
		this.robotImpl = robotImpl;
		this.multCanon = mC;
		this.multShield = mS;
		this.multFreq = mF;
	}
	
	@Override
	public int getCanon() {
		return this.robotImpl.getCanon() * this.multCanon;
	}

	@Override
	public int getShield() {
		return this.robotImpl.getShield() * this.multShield;
	}

	@Override
	public int getFreq() {
		return this.robotImpl.getFreq() * this.multFreq;
	}

	@Override
	public String getName() {
		
		return this.robotImpl.getName();
	}

	@Override
	public int diffLife(int i) {
		// TODO Auto-generated method stub
		return this.robotImpl.diffLife(i);
	}
	public Object clone()throws CloneNotSupportedException{  
		return (Robot)super.clone();  
	   }
	
}

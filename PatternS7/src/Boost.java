public abstract class Boost implements Robot{
	private Robot robot;
	
	@Override
	public int getCanon() {
		return robot.getCanon();
	}

	@Override
	public int getShield() {
		return robot.getShield();
	}

	@Override
	public int getFreq() {
		return robot.getFreq();
	}

	@Override
	public String getName() {
		return robot.getName();
	}
	
	@Override
	public int diffLife(int i) {
		return robot.diffLife(i);
	}
}

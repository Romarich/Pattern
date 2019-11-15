
public class BoostDiminutionDegats extends Boost {

	public BoostDiminutionDegats() {
		super();
	}
	
	public int diffLife(int i) {
		return super.diffLife(i/2);
	}
}

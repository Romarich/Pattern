
public class BoostArme extends Boost{
	
	public BoostArme() {
		super();
	}

	@Override
	public int getCanon() {
		return super.getCanon()*2;
	}
}

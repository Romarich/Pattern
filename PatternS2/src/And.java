import java.io.IOException;

public class And implements Strategy{	

	private Strategy[] strat;
	
	public And(Strategy... s){
		strat = s;
	}

	@Override
	public boolean execute(String mot) throws IOException {
		for(Strategy st : strat) {
			if(!st.execute(mot)) return false;
		}
		return true;
	}	
	
}

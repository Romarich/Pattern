import java.io.IOException;

public class Not implements Strategy{	

	private Strategy strat;
	
	public Not(Strategy s){
		strat = s;
	}

	@Override
	public boolean execute(String mot) throws IOException {
		return !strat.execute(mot);
		
	}	
	
}

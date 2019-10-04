import java.io.IOException;

public interface Strategy {
	public boolean execute(String mot) throws IOException;
}

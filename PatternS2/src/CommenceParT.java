import java.io.*;
import java.util.*;

public class CommenceParT implements Strategy { // mal foutu

	public boolean execute(String mot) throws IOException {
		return mot.charAt(0) == 't';
	}

}

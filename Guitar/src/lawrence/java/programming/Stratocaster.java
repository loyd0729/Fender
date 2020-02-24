package lawrence.java.programming;

public class Stratocaster implements Fender {
	
	@Override
	public String volume() {
		return "yes";
		
	}

	@Override
	public String pickup() {
		return "senser";
	}
	
	@Override
	public boolean strings() {
		return true;
	}
	
}


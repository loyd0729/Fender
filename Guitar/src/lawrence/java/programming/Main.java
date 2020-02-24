package lawrence.java.programming;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fender fender = new Stratocaster();
		System.out.println("Stratocaster Features");
		System.out.println("Pickup name: " + fender.pickup());
		System.out.println("Volume type: " + fender.volume());
		System.out.println("6 Strings: " + fender.strings());
		
		Fender fender1 = new Telecaster();
		System.out.println("\nTelecaster Features");
		System.out.println("Pickup name: " + fender1.pickup());
		System.out.println("Volume type: " + fender1.volume());
		System.out.println("6 Strings: " + fender1.strings() + " It's 12-Strings");

	}

}

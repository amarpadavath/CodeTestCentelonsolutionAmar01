package Test005oopsconcepts3;

public class Test024Main {

	public static void main(String args[]) {
		Test023Car s = new Test023Car();

		s.playRadio();

		s.startEngine();

		s.stopEngine();

		Test022Vehicle s1 = new Test023Car();

		s1.startEngine();

		s1.stopEngine();

		// Test015Vehicle s1 = new Test016car();
		// s1.startEngine(); // "Car engine started."
		// s1.stopEngine(); // "Vehicle engine stopped."
		// s1.playRadio(); // ERROR: Cannot resolve method 'playRadio' in
		// 'Test015Vehicle'

	}

}

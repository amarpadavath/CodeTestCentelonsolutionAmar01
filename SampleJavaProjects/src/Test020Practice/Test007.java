package Test020Practice;

public class Test007 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubint
		int x = 10;

		long fact = 1;

		for (int i = 1; i <= x; i++) {

			fact = fact * i;

		}
		
		System.out.println(fact);

		if (x == 0 || x == 1) {

			System.out.println("1");
		}

	}

}

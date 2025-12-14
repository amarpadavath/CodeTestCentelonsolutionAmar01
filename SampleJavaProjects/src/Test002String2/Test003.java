package Test002String2;

public class Test003 {

	public static void main(String args[]) {
		String s = "Amar";
		String b = "AmaR";

		System.out.println(s.compareTo(b));

		System.out.println(s.compareToIgnoreCase(b));

		String s1 = "Amar";
		String b1 = "AmaR1";

		System.out.println(s1.compareTo(b1));

		System.out.println(s1.compareToIgnoreCase(b1));

	}

}

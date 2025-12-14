package Test002string;

public class Test120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "Another String";
		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
		System.out.println(myStr1.equals(myStr3)); // false
		
		String myStr11 = "Hello";
		String myStr21 = "HELLO";
		String myStr31 = "Another String";
		System.out.println(myStr11.equalsIgnoreCase(myStr21)); // true
		System.out.println(myStr11.equalsIgnoreCase(myStr31)); // false

	}

}

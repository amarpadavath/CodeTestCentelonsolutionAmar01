package Test002string;

public class Test119 {
	
	public static void main(String args[])
	{
		String myStr1 = "Hello";
		String myStr2 = "Hello";
		System.out.println(myStr1.compareTo(myStr2));
		
		String firstName = "John ";
		String lastName = "Doe";
		System.out.println(firstName.concat(lastName));
		
		String myStr = "Hello";
		System.out.println(myStr.contains("Hel"));   // true
		System.out.println(myStr.contains("e"));     // true
		System.out.println(myStr.contains("Hi"));    // false
		
		String myStr11 = "Hello";
		System.out.println(myStr11.contentEquals("Hello"));  // true
		System.out.println(myStr11.contentEquals("e"));      // false
		System.out.println(myStr11.contentEquals("Hi"));     // false
		
		char[] myStr112 = {'H', 'e', 'l', 'l', 'o'};
		String myStr22 = "";
		myStr2 = myStr2.copyValueOf(myStr112, 0, 5);
		System.out.println("Returned String: " + myStr2);
		
		String myStrq = "Hello";
		System.out.println(myStrq.endsWith("Hel"));   // false
		System.out.println(myStrq.endsWith("llo"));   // true
		System.out.println(myStrq.endsWith("o"));     // true
	}

}

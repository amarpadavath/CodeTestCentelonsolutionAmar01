package Test002String2;

public class Test026 {
	
	public static void main(String args[])
	{
		String myStr = "Hello";
		System.out.println(myStr.startsWith("Hel"));   // true
		System.out.println(myStr.startsWith("llo"));   // false
		System.out.println(myStr.startsWith("o"));     // false
		System.out.println(myStr.startsWith("Hel"));
		
		String myStr1 = "Hello, World!";
		System.out.println(myStr1.subSequence(7, 12));
		
		String myStr3 = "Hello, World!";
		System.out.println(myStr3.substring(7, 12));
		
		String myStr4 = "Hello";
		//char[] myArray = myStr.toCharArray();
		char arr[] = myStr4.toCharArray();
		System.out.println(arr);
				
		System.out.println(arr[0]);
		
		String txt = "Hello World";
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		String myStr6 = "Hello, World!";
		System.out.println(myStr6.toString());
		
		String myStr7 = "       Hello World!       ";
		System.out.println(myStr7);
		System.out.println(myStr7.trim());
		
		char[] myArray = {'a', 'b', 'c'};
		System.out.println(String.valueOf(myArray));
		System.out.println(String.valueOf('A'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(4.5f));
		System.out.println(String.valueOf(5.2));
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf(1400L));
	}

}

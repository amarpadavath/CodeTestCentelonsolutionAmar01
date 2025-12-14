package Test002string;

public class Test118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStr = "Hello";
		char result = myStr.charAt(0);
		System.out.println(result);
		
		//String myStr = "Hello";
		int result1 = myStr.codePointAt(0);
		System.out.println(result1);
		
		int result2 = myStr.codePointCount(0, 5);
		System.out.println(result2);

	}

}

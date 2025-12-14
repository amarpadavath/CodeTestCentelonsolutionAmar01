package Test002String2;

public class Test023 {
	
	public static void main(String args[])
	{
		String s =  "I love cats. Cats are very easy to love. Cats are very popular.";
		
		String b = "(?i)cat";
		
		System.out.println(s.replaceAll(b, "dog"));
	}

}

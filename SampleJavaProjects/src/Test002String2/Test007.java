package Test002String2;

public class Test007 {
	
	public static void main(String args[])
	{
		char[] s = { 'i','j', 'k','l'};
		
		String b ="";
		
		b = b.copyValueOf(s,0,4);
		
		System.out.println("Return string "+b);
		
	}

}

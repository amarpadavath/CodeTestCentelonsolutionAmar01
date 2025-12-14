package Test002String2;

public class Test006ContentEquals {
	
	public static void mian(String args[])
	{
		String s = "Helow";
		
		System.out.println(s.contentEquals("he"));
		
		System.out.println(s.contentEquals("He"));
		
		System.out.println(s.contentEquals("ew"));
	}

}

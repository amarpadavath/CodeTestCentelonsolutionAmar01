package Test002string;

public class Test111 {
	
	public static void main(String args[])
	{
		
	
	
	String s1 = " computer";
	String s2 = null;
	
	 String s3 = s1.concat(s2);

     // It will raise NullPointerException
     System.out.println(s3);
	
	}

}

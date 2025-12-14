package Test018Practice;

public class Test001 {
	
public static void main(String args[])
	
	{
		
		String s= "radar1";
		
		int w= s.length();
		String rev="";
		
		for(int i=w-1;i>=0;i--)
		{
			
			rev = rev + s.charAt(i);
			
		}
		
		System.out.println(rev);
		
		if(rev.equals(s))
		{
			System.out.println("Palindrome");
			
		}
		else
		{
			System.out.println("not Palindrome");
		}
			
		
	}

}

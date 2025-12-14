package Test018Practice;

public class Test007 {
	public static void main(String args[])
	{
		
		String s = "I am amar";
		
		String[] a = s.split(" ");
		
		String rev="";
		
		for(int i= a.length-1;i>=0;i--)
		{
			
			rev = rev + a[i]+ " ";
		}
		
		
		System.out.println(rev.trim());
		
		
		
		
		
	}

}

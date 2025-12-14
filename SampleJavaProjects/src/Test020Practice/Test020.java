package Test020Practice;

import java.util.Arrays;

public class Test020 {
	
	public static void main(String args[])
	{
		 isAnagram("Mother In Law", "Hitler Woman");

}

	public static void isAnagram(String string1, String string2) {
		// TODO Auto-generated method stub
		boolean status=true;
		if(string1.length()==string2.length())
		{
			status= false;
		}
		
		else
		{
		
		
		char[] st1=string1.replaceAll(" ","").toLowerCase().toCharArray();
		char[] st2=string2.replaceAll(" ","").toLowerCase().toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		 status = Arrays.equals(st1, st2);
		 
		 if(status)
		 {
			 System.out.println("True");
		 }
		 else
		 {
			 System.out.println("false");
		 }
		} 
		
		
	}
}

package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0007CheckVowelPresent {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		String q = s.nextLine();
		
		boolean vowelFound = false;
		
		for(int i=0;i<q.length();i++)
		{
			char ch = q.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowelFound = true;
				break;
			}
			
		}
		
		if(vowelFound)
		{
			System.out.println("vowel is present");
			
			}
		
		else
		{
			System.out.println("no");
		}
		
	}

}

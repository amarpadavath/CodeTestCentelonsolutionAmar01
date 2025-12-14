package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0008CheckVowel2 {
	
	
	public static void main(String args)
	{
		Scanner s = new Scanner(System.in);
		
		String input = s.next();
		
		checkVowel(input);
		
		 s.close();
		
		
	}

	public static void checkVowel(String inp)
	{
		inp= inp.toLowerCase();
		
		for(int i=0;i<=inp.length();i++)
		{
		
		char ch = inp.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println("vowel prsent");
			return;
		}
				
		}
		
		System.out.println("no");
				
	}
}

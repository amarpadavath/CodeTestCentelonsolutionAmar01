package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0009check3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in) ;
		
		String input = s.next();
		
		if(Test0009check3.checkVowel(input))
				{
			System.out.println("present");
				}
		else
		{
			System.out.println("no");
		}
		
		
	}
	
	public static boolean checkVowel(String in)
	{
		
		in = in.toLowerCase();
		 for(int i=0;i<=in.length();i++)
		 {
			 char ch = in.charAt(i);
			 
			 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			 {
				 return true;
			 }
		 }
		return false;
		
	}

}

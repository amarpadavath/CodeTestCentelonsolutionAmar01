package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0010Countofvowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		String w = s.next();
		
		System.out.println(countVowel(w));
		
		

	}
	
	public static int countVowel(String in)
	{
		
		int count =0;
		
		in = in.toLowerCase();
		for(int i=0;i<=in.length()-1;i++)
		{
			char ch = in.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				count++;
				
				//return count;
			}
		}
		return count;
		
	}

}

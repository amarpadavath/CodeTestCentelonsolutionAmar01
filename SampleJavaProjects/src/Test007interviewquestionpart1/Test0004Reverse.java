package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0004Reverse {
	
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
				
				String w = s.nextLine();
		
		String f= "";
		
		int t = w.length();
		
		for(int i=t-1;i>=0;i--)
		{
			f = f + w.charAt(i);
		}
		
		System.out.println(f);
	}

}

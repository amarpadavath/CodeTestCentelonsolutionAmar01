package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0015CountOfDigits {
	
	public static void main(String args[])

	{
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int count =0;
		
		while(x !=0)
		{
			x = x/10;
			count++;
		}
		
		System.out.println(count);
		
		for(;x!=0;x/=10)
		{
			count++;
		}
		
		System.out.println(count);
	}
}

package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0013Factorial {
	
	public static void main(String args[])
	{
		Scanner s= new Scanner(System.in);
		
		int x = s.nextInt();
		
		long result = factorial(x);
		
		System.out.println(result);
		
		
	}
	
	public static long factorial(int num)
	{
		if(num==0|| num==1)
		{
			return 1;
		}
		
		long fact=1;
		
		for(int i=2;i<=num;i++)
		{
			fact *= i;
		}
		
		return fact;
		
	}

}

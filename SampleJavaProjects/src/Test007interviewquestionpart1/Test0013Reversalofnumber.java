package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0013Reversalofnumber {
	

public static void main(String args[])
	
	{
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int r = reversedNumberMethod(x);
		
		System.out.println(r);
		
		
	}
	
	public static int reversedNumberMethod(int num1)
	{
		
		
		int r1 =0;
		
		while(num1 !=0)
		{
			
		int digit= num1%10;
		
		r1 = r1*10 + digit ;
		
		num1=num1/10;
		}
		
		return r1;
		
		
		
	}
	

}

package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0011PrimeNoorNot {
	
public static void main(String args[])
	
	{
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if(isPrime(x))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
		
		
		
	}
	
	public static boolean isPrime(int num)
	
	{
		
		if(num <= 1 )
		{
			return false;
		}
		
		for(int i=2;i<=Math.sqrt(num);i++)
			
			{
				if(num % i ==0)
				{return false;
				}
				
			}
			
			return true;
		
		
		
		
		
		}

}
	
	




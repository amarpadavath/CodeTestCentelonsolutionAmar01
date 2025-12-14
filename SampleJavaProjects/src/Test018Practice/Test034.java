package Test018Practice;

import java.util.Scanner;

public class Test034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if(isPrime(x))
		{
			System.out.println("Prime no");
		}
		
		else
		{
			System.out.println("no");
		}

	}
	
	public static boolean isPrime(int x)
	{
		

		boolean isPrime = false;
		
		
		if(x<=1)
		{
			return false;
			
		}
		
		for(int i =2;i<=Math.sqrt(x);i++)
			
			{
				
				if(x%i==0)
				{
					return false;
				}
				
				
			}
		return true;
			
			
		
		
		
	}
	
}

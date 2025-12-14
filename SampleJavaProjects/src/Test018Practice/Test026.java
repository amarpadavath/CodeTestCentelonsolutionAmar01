package Test018Practice;

import java.util.Scanner;

public class Test026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if(isPrime(x))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("bo bo");
		}

	}

	public static boolean isPrime(int x)
	{
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

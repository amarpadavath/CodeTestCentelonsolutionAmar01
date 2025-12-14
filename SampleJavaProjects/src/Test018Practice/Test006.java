package Test018Practice;

import java.util.Scanner;

public class Test006 {
	
	public static void main(String args[])
	{
		
		Scanner s  = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int num = 2;num<=x;num++)
		{
			
			boolean isPrime= true;
			
			for(int i = 2;i<=Math.sqrt(num);i++)
			{
				if(num%i==0)
				{
					isPrime = false;
					break;
				}
			}
			if(isPrime)
			{
				System.out.print(num+" ");
			}
		}
		
		
		
		
	}

}

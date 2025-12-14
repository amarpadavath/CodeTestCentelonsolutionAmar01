package Test018Practice;

import java.util.Scanner;

public class Test020 {
	
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int rev =0;
		
		int num = x;
		
		
		
		while(x!=0)
		{
			int digit = x%10;
			
		//	num = num%10;
			rev = rev * 10+ digit;
			x=x/10;
			
			
			
		}
		
		System.out.println(rev);
		
		
	}

}

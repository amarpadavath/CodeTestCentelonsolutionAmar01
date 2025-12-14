package Test018Practice;

import java.util.Scanner;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		int original = x;
		
		int reversed =0;
		
		while(x!=0)
		{
			
			int digit = x%10;
			
			reversed= reversed *10 +  digit;
			
			x= x/10;
			
			
		}
		
		System.out.println(reversed);
		
		if(original==reversed)
		{
			System.out.println("Paindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		

	}

}

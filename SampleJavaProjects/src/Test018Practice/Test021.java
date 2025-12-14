package Test018Practice;

import java.util.Scanner;

public class Test021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int rev = 0;
		
		int x = num;
		while(x!=0)
		{
			
			int digit = x%10;
			rev = rev*10 + digit;
			
			x = x/10;
			
		}
		
		System.out.println(rev);
		
		

	}

}

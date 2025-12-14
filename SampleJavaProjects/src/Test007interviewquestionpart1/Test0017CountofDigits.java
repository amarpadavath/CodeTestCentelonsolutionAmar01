package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0017CountofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			
			System.out.println("enter a digit");
			Scanner s = new Scanner(System.in);
			
			int x = s.nextInt();
			
			int count =0;
			System.out.println("enter  digit to find");
			Scanner e = new Scanner(System.in);
			
			
			int digitTofind = e.nextInt();
			
			while(x !=0)
			{
				int lastDigit = x%10;
				
				if(lastDigit==digitTofind)
				{
				count++;
				}
				x/=10;
			}
			
			System.out.println(count);
			
			
		}

	}

}

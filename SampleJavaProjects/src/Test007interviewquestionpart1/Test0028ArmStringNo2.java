package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0028ArmStringNo2 {
	
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		
		int number = scanner.nextInt();
		
		int originalNumber = number;
		
		int results =0;
		
		int numberOfDigits = String.valueOf(number).length();
		
		while(number != 0)
		{
			int digit = number % 10;
			
			results += Math.pow(digit, numberOfDigits);
			
			number /= 10;
			
		}
		
		if(results ==originalNumber)
		{
			System.out.println(originalNumber + ".....is an Arm String no");
		}
		else
		{
			System.out.println(originalNumber + "..........is not Arm String no");
		}
	}

}

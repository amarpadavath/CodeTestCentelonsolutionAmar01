package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0014LeapYear {

	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		int year = s.nextInt();
		
		if(isLeapyear(year))
		{
			System.out.println("leapyear");
		}
		else
		{
			System.out.println("not leapyear");
		}
		
		
		
	}
	
	public static boolean isLeapyear(int year)
	{
	
	if(year % 4==0)
	{
		if(year % 100 ==0)
		{
			return year  % 400 ==0;
		}
		else
		{
			return true;
		}
			
	}
	else
	{
		return false;
	}
	
}

}

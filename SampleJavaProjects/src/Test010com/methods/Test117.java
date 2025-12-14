package Test010com.methods;

import java.util.Scanner;

public class Test117 {
	
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		
		int d = s.nextInt(10);				
		checkAge(d);
	}

	public static void checkAge(int age)
	{
		if(age>10)
		{
			System.out.println("age is greater");
		}
		else
		{
			System.out.println("age is lesser");
		}
	}
}

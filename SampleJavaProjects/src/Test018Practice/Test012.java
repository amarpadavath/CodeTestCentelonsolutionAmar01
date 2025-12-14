package Test018Practice;

import java.util.Scanner;

public class Test012 {
	
	public static void main(String args[])
	{
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			
			for(int space =1;space<=x-i;space++)
			{
				System.out.print(" ");
			}
			
			for(int star =1;star<=(2*i-1);star++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		
	}

}

package Test020Practice;

import java.util.Scanner;

public class Test017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i=1;i<=x;i++)
		{
			for(int space=1;space<=x-i;space++)
			{
				System.out.print(" ");
			}
			
			for(int star=1;star<=(2*i-1);star++)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}

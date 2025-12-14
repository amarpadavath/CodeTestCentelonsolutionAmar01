package Test018Practice;

import java.util.Scanner;

public class Test009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		if(x==0 || x ==1)
		{
			System.out.println(1);
		}
		
		int fact = 1;
		
		for(int i =1;i<=x;i++)
		{
			fact= fact * i;
		}
		
		System.out.println(fact);

	}

}

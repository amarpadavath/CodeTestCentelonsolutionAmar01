package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0016Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		int first =0;
		int second =1;
		 System.out.println("Fibonacci Series up to " + x + " terms:");
		
		for(int i=1;i<=x;i++)
			
		{
			System.out.print(first + " "); 
			int next = first + second;
			
			first= second;
			second=next;
		}
		

		

	}

}

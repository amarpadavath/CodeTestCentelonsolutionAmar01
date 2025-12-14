package Test008interviewquestionpart2;

import java.util.Scanner;

public class Test0001Reversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Amar pv i am";
		
		Scanner w= new Scanner(System.in);
		
		String s1 = w.nextLine();
		String rev="";
		
		int c= s1.length();
		
		for(int i=c-1;i>=0;i--)
		{
			rev = rev + s1.charAt(i);
		}
		
		System.out.println(rev);
		

	}

}

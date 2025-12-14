package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0001reversalofString {

	public static void main(String[] args) {
		
	//	String s = "fbcvnbnvbnvbmnmnbm vbnvm";
		
		Scanner s1 = new Scanner(System.in);
		
		String w = s1.nextLine();
		
		
		String rev = "";
		
		int t = w.length();
		
		for(int i = t-1;i>=0;i--)
		{
			rev = rev + w.charAt(i);
			
			
		}
		
		System.out.println(rev);
		
		/*
		 * String s = "amar i am ";
		 * int t = s.length();
		 * String rev = "";
		 * for(int i=t-1;i>=0;i--)
		 * {
		 * rev = rev + s.charAt(i);
		 */


	}

}

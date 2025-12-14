package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0030CountNoOfDigitsinNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int count = String.valueOf(num).length();
		
		System.out.println(count);
		

	}

}

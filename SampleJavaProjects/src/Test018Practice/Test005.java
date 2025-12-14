package Test018Practice;

import java.util.Scanner;

public class Test005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner x = new Scanner(System.in);
		
		int s = x.nextInt();

		if (s <= 1) {
			System.out.println("not prime no");
		}
		boolean isPrime = true;
		for (int i = 2; i <= Math.sqrt(s); i++) {

			if (s % i == 0) {
				isPrime = false;
				break;

			}

		}
		if (isPrime) {
			System.out.println("Prime no");
		} else {
			System.out.println("not prime no");
		}

	}

}

package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0040StartPyramid {
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input number of rows
	        System.out.print("Enter number of rows: ");
	        int rows = scanner.nextInt();

	        // Outer loop for each row
	        for (int i = 1; i <= rows; i++) {
	            // Print leading spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }

	            // Print stars with space
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            // Move to next line
	            System.out.println();
	        }
	    }

}

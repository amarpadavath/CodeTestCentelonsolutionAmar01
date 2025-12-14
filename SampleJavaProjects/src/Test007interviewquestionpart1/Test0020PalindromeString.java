package Test007interviewquestionpart1;

import java.util.Scanner;

public class Test0020PalindromeString {
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a string: ");
	        String original = scanner.nextLine();  // Take input from the user

	        // Convert the string to lowercase to make the check case-insensitive
	        String normalized = original.toLowerCase();

	        // Initialize pointers to check characters from both ends
	        int left = 0;
	        int right = normalized.length() - 1;
	        boolean isPalindrome = true;

	        // Compare characters from both ends
	        while (left < right) {
	            if (normalized.charAt(left) != normalized.charAt(right)) {
	                isPalindrome = false;  // Set flag to false if characters don't match
	                break;
	            }
	            left++;
	            right--;
	        }

	        // Output the result
	        if (isPalindrome) {
	            System.out.println(original + " is a palindrome.");
	        } else {
	            System.out.println(original + " is not a palindrome.");
	        }

	        scanner.close();
	    }
	}

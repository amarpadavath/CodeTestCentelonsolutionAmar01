package Test007interviewquestionpart1;

import java.util.HashMap;

public class Test0035VowelLettercountEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String input = "Automation Testing Engineer";

	        // Convert to lowercase to handle uppercase vowels too
	        input = input.toLowerCase();

	        // Create a map to store vowel counts
	        Map<Character, Integer> vowelCount = new HashMap<>();

	        // Define the vowels
	        String vowels = "aeiou";

	        // Loop through the string
	        for (char c : input.toCharArray()) {
	            if (vowels.indexOf(c) != -1) {
	                vowelCount.put(c, vowelCount.getOrDefault(c, 0) + 1);
	            }
	        }

	        // Print each vowel and its count
	        for (char v : vowels.toCharArray()) {
	            System.out.println(v + ": " + vowelCount.getOrDefault(v, 0));
	        }

	}

}

package Test007interviewquestionpart1;

public class Test0037CountofConsanants {

	public class ConsonantCount {
	    public static void main(String[] args) {
	        String input = "Automation Testing Engineer";

	        // Convert to lowercase to simplify comparison
	        input = input.toLowerCase();

	        int consonantCount = 0;

	        // Loop through each character
	        for (char c : input.toCharArray()) {
	            // Check if it's an alphabet letter and not a vowel
	            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
	                consonantCount++;
	            }
	        }

	        System.out.println("Total consonants: " + consonantCount);
	    }
	}

}

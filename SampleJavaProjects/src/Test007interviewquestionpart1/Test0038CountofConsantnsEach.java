package Test007interviewquestionpart1;

public class Test0038CountofConsantnsEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		import java.util.HashMap;
		import java.util.Map;

		public class ConsonantLetterCount {
		    public static void main(String[] args) {
		        String input = "Automation Testing Engineer";

		        // Convert to lowercase to handle case-insensitive comparison
		        input = input.toLowerCase();

		        // Create a map to store consonant counts
		        Map<Character, Integer> consonantCount = new HashMap<>();

		        // Loop through each character
		        for (char c : input.toCharArray()) {
		            // Check if it's a letter and not a vowel
		            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
		                consonantCount.put(c, consonantCount.getOrDefault(c, 0) + 1);
		            }
		        }

		        // Print the count of each consonant
		        System.out.println("Consonant counts:");
		        for (Map.Entry<Character, Integer> entry : consonantCount.entrySet()) {
		            System.out.println(entry.getKey() + ": " + entry.getValue());
		        }
		    }
		}


	}

}

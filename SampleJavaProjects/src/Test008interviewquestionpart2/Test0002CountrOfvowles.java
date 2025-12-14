package Test008interviewquestionpart2;

import java.util.HashMap;

public class Test0002CountrOfvowles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String text = "Hello World, Java is awesome!";
	        text = text.toLowerCase();  // case-insensitive

	        // Initialize vowels in HashMap
	        HashMap<Character, Integer> vowelMap = new HashMap<>();
	        for (char v : "aeiou".toCharArray()) {
	            vowelMap.put(v, 0);
	        }

	        // Count vowels
	        for (char ch : text.toCharArray()) {
	            if (vowelMap.containsKey(ch)) {
	                vowelMap.put(ch, vowelMap.get(ch) + 1);
	            }
	        }

	        // Print results
	        for (char v : vowelMap.keySet()) {
	            System.out.println(v + " : " + vowelMap.get(v));
	        }

	}

}

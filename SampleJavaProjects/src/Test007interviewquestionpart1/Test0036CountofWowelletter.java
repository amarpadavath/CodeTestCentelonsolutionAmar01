package Test007interviewquestionpart1;

public class Test0036CountofWowelletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String input = "Automation Testing Engineer";

	        input = input.toLowerCase();

	        int totalVowels = 0;

	        for (char c : input.toCharArray()) {
	            if ("aeiou".indexOf(c) != -1) {
	                totalVowels++;
	            }
	        }

	        System.out.println("Total number of vowels: " + totalVowels);
	    }

	

}

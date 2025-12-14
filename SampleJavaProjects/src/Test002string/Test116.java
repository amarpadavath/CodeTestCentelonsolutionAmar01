package Test002string;

public class Test116 {
	
	public static void main(String args[])
	
	{
	
	
	        String str = "Programming in Java is fun! Java is powerful.";
	        
	        
	        
	        
	        
	        // 1. indexOf(int ch) – Returns the index of the first occurrence of the specified character.
	        int firstOccurrenceOfChar = str.indexOf('J');
	        System.out.println("First occurrence of 'J': " + firstOccurrenceOfChar);  // Output: 18
	        
	        int firstOccuranceOfCharacter = str.indexOf('J');
	        
	        
	        
	        System.out.println(firstOccuranceOfCharacter);
	        
	        // 2. indexOf(int ch, int fromIndex) – Returns the index of the first occurrence starting from a specific index.
	        //int firstOccurrenceFromIndex = str.indexOf('J', 19);
	        //System.out.println("First occurrence of 'J' from index 19: " + firstOccurrenceFromIndex);  // Output: 29
	        
	       // int first
	        
	        // 3. indexOf(String str) – Returns the index of the first occurrence of the specified substring.
	       // int firstOccurrenceOfSubstring = str.indexOf("Java");
	        //System.out.println("First occurrence of 'Java': " + firstOccurrenceOfSubstring);  // Output: 18
	        //
	        // 4. indexOf(String str, int fromIndex) – Returns the index of the first occurrence of the substring starting from a specific index.
	       // int firstOccurrenceOfSubstringFromIndex = str.indexOf("Java", 19);
	        //System.out.println("First occurrence of 'Java' from index 19: " + firstOccurrenceOfSubstringFromIndex);  // Output: 29
	        
	        //// 5. lastIndexOf(int ch) – Returns the index of the last occurrence of the specified character.
	       // int lastOccurrenceOfChar = str.lastIndexOf('J');
	       // System.out.println("Last occurrence of 'J': " + lastOccurrenceOfChar);  // Output: 29
	        
	        // 6. lastIndexOf(int ch, int fromIndex) – Returns the index of the last occurrence of the character starting from the specified index.
	        // lastOccurrenceFromIndex = str.lastIndexOf('J', 28);
	       // System.out.println("Last occurrence of 'J' from index 28: " + lastOccurrenceFromIndex);  // Output: 18
	        
	        // 7. lastIndexOf(String str) – Returns the index of the last occurrence of the specified substring.
	        //int lastOccurrenceOfSubstring = str.lastIndexOf("Java");
	       // System.out.println("Last occurrence of 'Java': " + lastOccurrenceOfSubstring);  // Output: 29
	        
	        // 8. lastIndexOf(String str, int fromIndex) – Returns the index of the last occurrence of the substring starting from the specified index.
	        //int lastOccurrenceOfSubstringFromIndex = str.lastIndexOf("Java", 28);
	       // System.out.println("Last occurrence of 'Java' from index 28: " + lastOccurrenceOfSubstringFromIndex);  // Output: 18
	   
	        
	          // Creating StringBuffer
	        StringBuffer s1 = new StringBuffer();
	      
	          // Adding elements in StringBuffer
	        s1.append("Hello");
	        s1.append(" ");
	        s1.append("world");
	        
	          // String with the StringBuffer value
	          String str2 = s1.toString();
	          
	        System.out.println(str2);
	}
}





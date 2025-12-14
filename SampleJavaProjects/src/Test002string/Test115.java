package Test002string;

import java.util.Locale;

public class Test115 {
	 public static void main(String args[])
	 {
		 String s = "GeelsorGeeks";
		 String c = "geelsorGeeks111";
		 
		 System.out.println("lenth...."+s.length());
		 
		 System.out.println("Charater at 3rd position..."+s.charAt(3));
		 
		 System.out.println("lenth..."+s.isBlank());
		 
		 System.out.println("lenth..."+s.compareTo(c));
		 
		 System.out.println("lenth..."+s.compareToIgnoreCase(c));
		 
	
			        String str1 = "Hello";
			        String str2 = "hello";
			        String str3 = new String("Hello");
			        String str4 = "World";
			        
			    //    System.out.println(str1.equals(str2)); // true, because they are the same string
			      //  System.out.println(str1.equals(str3)); // true, because the characters are identical
			      //  System.out.println(str1.equals(str4)); // false, different characters
			       // System.out.println(str1.equals(null)); // false, comparing with null
			        
			        System.out.println("result s "+str1.equals(str4));
			        
			        System.out.println("results "+str1.equalsIgnoreCase(str2));
			        
			        System.out.println("results "+str1.substring(2,3));
			        
			        System.out.println("results "+str1.substring(0));
			        
			        System.out.println("results "+str1.isEmpty());
			        
			        System.out.println("results "+str1.toLowerCase());
			        System.out.println("results "+str1.toUpperCase());
			       // System.out.println("results "+str1.toLowerCase(null));
			        
			     // String in English
			        String englishText = "Hello";
			        System.out.println(englishText.toLowerCase(Locale.US));  // Output: "hello"

			        // String in Turkish
			        String turkishText = "İSTANBUL";
			        System.out.println(turkishText.toLowerCase(Locale.forLanguageTag("tr")));  // Output: "istanbul"

			        // Note the difference with "I" in Turkish
			        String iExample = "Istanbul";
			        System.out.println(iExample.toLowerCase(Locale.US));  // Output: "istanbul"
			        System.out.println(iExample.toLowerCase(Locale.forLanguageTag("tr")));  // Output: "ıstanbul"

			        String t = "amar is going home";
			        
			        System.out.println("index of "+t.indexOf(0));
			        System.out.println("index of "+t.indexOf(str4));
			        
			        
			        
			    
			}

	
		 
		 
	 

}

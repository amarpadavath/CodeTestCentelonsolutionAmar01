package Test020Practice;

import java.util.Arrays;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String str = "hello";
		    char[]chars = str.toCharArray();
		    
		    System.out.println(chars);
		    
		    int[]arr4 = {
	    	        9,
	    	        1,
	    	        8,
	    	        2,
	    	        7
	    	    };
	    	    Arrays.parallelSort(arr4);
	    	    System.out.println(Arrays.toString(arr4));
	    	    
	    	    char[]vowels = {
	    	            'a',
	    	            'e',
	    	            'i',
	    	            'o',
	    	            'u'
	    	        };
	    	    
	    	    System.out.println(vowels);
	    	    
	    	    System.out.println(vowels.length);
	    	    System.out.println(Arrays.toString(vowels));
		    
		    

	}

}

package Test020Practice;

import java.util.Arrays;
import java.util.List;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int[]arr = {
	            5,
	            3,
	            1,
	            4,
	            2
	        };
	    
	   Arrays.sort(arr);
	   
	   System.out.println(Arrays.toString(arr));
	   
	   int index = Arrays.binarySearch(arr, 1);
	   
	   System.out.println(index);
	   
	   int[]arr1 = new int[5];
	    Arrays.fill(arr, 7);
	    System.out.println(Arrays.toString(arr1)); // Output: [7, 7, 7, 7, 7]
	    
	    String[] arr2 = { "test","test1","test3"};
	    
	   
	    
	    System.out.println(Arrays.toString(arr2));
	    
	    int[]a = {
	            1,
	            2,
	            3
	        };
	        int[]b = {
	            1,
	            2,
	            3
	        };
	        System.out.println(Arrays.equals(a, b));
	        
	        int[] copy = Arrays.copyOf(a, 6);
	        
	        System.out.println(Arrays.toString(copy));
	        
	    //    System.out.println(copy.toString());
	        
	       int[] o = {10,20,50};
	      // int[] q = {30,80,50};
	       
	       int[] subArray = Arrays.copyOfRange(o, 0,1);
	       
	       System.out.println(Arrays.toString(subArray));
	       
	       int[]arr4 = {
	    	        9,
	    	        1,
	    	        8,
	    	        2,
	    	        7
	    	    };
	    	    Arrays.parallelSort(arr4);
	    	    System.out.println(Arrays.toString(arr4));
	    	    
	    	    String[] s = {"amar","test","dfbf"};
	    	    
	    	    List<String> d= Arrays.asList(s);
	    	    
	    	    System.out.println(d);
	    

	}

}

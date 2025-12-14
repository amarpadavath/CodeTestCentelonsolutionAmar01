package Test002String2;

import java.util.Arrays;
import java.util.List;

public class Test028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   List<String> list1 = Arrays.asList("A", "B", "C");
	        list1.set(1, "X"); // Works
	        // list1.add("D"); // Error
	        System.out.println("Arrays.asList: " + list1);

	        // List.of
	        List<String> list2 = List.of("A", "B", "C");
	      //   list2.set(1, "X"); // Error
	      //   list2.add("D"); // Error
	        System.out.println("List.of: " + list2);
	        
	    

	}

}

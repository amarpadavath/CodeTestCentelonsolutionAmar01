package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1012 {
	
	
	public static void main(String arg[])
	{
		List<String> a = new ArrayList<>();
		// List<String> l = new ArrayList<>();


		a.add("amar");

		a.add("amar1");
		a.add("amar2");
		a.add("amar3");

		Collections.sort(a);
		
	      // BinarySearch on the List
       // System.out.println(
       //     "The index of Horse is: "
       //     + Collections.binarySearch(l, "Horse"));

        // BinarySearch on the List
      //  System.out.println(
        //    "The index of Dog is: "
         //   + Collections.binarySearch(l, "Dog"));

		System.out.println("index of amar 1: "+Collections.binarySearch(a, "amar1"));
		System.out.println("index of amar 1: "+Collections.binarySearch(a, "amar3"));
	}

}

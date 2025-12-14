package Test014collectionarraylist;

import java.util.List;
import java.util.Vector;

public class Test126 {

	public static void main(String args[]) {

		List<Integer> v = new Vector<Integer>(5);
		
		 for (int i = 1; i <= 5; i++)
		 {
	            v.add(i);
		 }

		for (Integer v1 : v) {
			System.out.println(v1);
		}

	}

}

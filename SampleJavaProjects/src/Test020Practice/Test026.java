package Test020Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Test026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int[] arr = {5, 9, 2, 11, 11, 7, 3,2};
		   
		   HashSet<Integer> s = new HashSet<Integer>();
		   
		   for(int n : arr)
		   {
			   s.add(n);
		   }
		   
		   System.out.println(s);
		   
		   ArrayList<Integer> d = new ArrayList<>(s);
		   
		   Collections.sort(d);
		   
		   int ind= d.size()-2;
		   
		   System.out.println(d.get(ind));
		   
		   System.out.println(d.get(1));
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}

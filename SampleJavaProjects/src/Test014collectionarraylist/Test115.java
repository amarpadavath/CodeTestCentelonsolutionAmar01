package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collection;

public class Test115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection<Integer> s = new ArrayList<Integer>(5);

		s.add(15);
		s.add(20);
		s.add(25);

		for(Integer n : s)
		{
		System.out.println("Number"+n);
		}
		Collection<Integer> b = new ArrayList<Integer>();

		b.addAll(s);

		System.out.println("array lits is"+b);

	}

}

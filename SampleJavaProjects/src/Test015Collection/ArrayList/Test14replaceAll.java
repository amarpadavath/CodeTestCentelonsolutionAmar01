package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test14replaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> s = new ArrayList<Integer>();
		
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(10);
		s.add(10);
		s.replaceAll(n->n+1);
		System.out.println(s);

	}

}

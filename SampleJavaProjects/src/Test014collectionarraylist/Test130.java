package Test014collectionarraylist;

import java.util.ArrayList;

public class Test130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("geeks");
		
		s.add("amar");
		
		System.out.println(s);
		
		s.add(1,"am");
		
		System.out.println(s);
		s.remove(0);
		
		  s.set(1, "GFG");
		  System.out.println(s);

	}

}

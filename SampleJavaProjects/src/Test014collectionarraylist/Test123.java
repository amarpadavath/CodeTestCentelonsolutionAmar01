package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Test123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s = new ArrayList<>();
		
		s.add("amar");
		s.add("amar1");
		s.add("amar2");
		
		System.out.println(s.get(0));
		System.out.println(s.get(1));
		System.out.println(s.get(2));
		
		boolean w = s.contains("amar5");
		
		System.out.println(w);
	}

}

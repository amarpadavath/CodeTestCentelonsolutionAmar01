package Test020Practice;

import java.util.HashSet;
import java.util.Set;

public class Test003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String>();
		
		s.add("A");
		s.add("A");
		s.add("AB");
		s.add("ABC");
		
		System.out.println(s);
		
		s.remove("A");
		
		System.out.println(s);
		

	}

}

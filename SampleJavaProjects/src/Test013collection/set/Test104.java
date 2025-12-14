package Test013collection.set;

import java.util.HashSet;
import java.util.Set;

public class Test104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> s = new HashSet<String>();
		 s.add("B");
		 s.add("D");
		 s.add("C");
		 s.add("A");
		 s.add("B");
		 
		 System.out.println(s);
		 
		 String check = "A";
		 
		 s.remove("B");
		 
		 System.out.println(s);
		 
		 System.out.println(s.contains(check));
		 
		

	}

}

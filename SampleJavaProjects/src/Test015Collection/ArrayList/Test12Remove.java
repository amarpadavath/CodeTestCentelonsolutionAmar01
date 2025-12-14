package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test12Remove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Amar 1");		
		s.add("Amar 2");		
		s.add("Amar 3");		
		s.add("Amar 4");	
		
		s.remove(0);
		System.out.println(s);
		
		s.removeAll(s);
		
		System.out.println(s);
		

	}

}

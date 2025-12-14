package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test16Set {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();		
		
		s.add("Amar 1");
		s.add("Amar 2");
		s.add("Amar 3");
		
		s.set(0, "Achu");
		System.out.println(s);
		
		System.out.println(s.size());
		
	}

}

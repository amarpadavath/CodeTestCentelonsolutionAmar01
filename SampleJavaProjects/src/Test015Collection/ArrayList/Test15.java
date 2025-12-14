package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test15 {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("volvo");
		s.add("BMW");
		s.add("Ford");
		s.add("Mazda");
		s.add("Toyota");
		
		ArrayList<String> s1 = new ArrayList<String>();
		s1.add("volvo1");
		s1.add("BMW");
		s1.add("Ford");
		s.retainAll(s1);
		System.out.println(s);
		
		
	}

}

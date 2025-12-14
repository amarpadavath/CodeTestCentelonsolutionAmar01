package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test008Contains {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("amar1");
		s.add("amar2");
		s.add("amar3");
		s.add("amar4");
		s.add("amar5");
		s.add("amar6");
		
		System.out.println(s.contains("amar1"));
		System.out.println(s.contains("amar2"));
		
	}

}

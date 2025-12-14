package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test006AddALL {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("amar1");
		s.add("amar2");
		
		ArrayList<String> b = new ArrayList<String>();
		
		b.add("test");
		b.add("test2");
		
		s.addAll(b);
		
		b.addAll(b);
		
		System.out.println(s);
		
		System.out.println(b);
		
		
	}

}

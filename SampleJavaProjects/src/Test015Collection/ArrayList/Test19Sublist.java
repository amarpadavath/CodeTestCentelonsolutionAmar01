package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test19Sublist {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("amar 1");
		s.add("amar 2");
		s.add("amar 3");
		s.add("amar 4");
		System.out.println(s.subList(1, 3));
		
	}

}

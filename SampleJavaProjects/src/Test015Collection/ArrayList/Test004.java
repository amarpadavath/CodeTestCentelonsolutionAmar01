package Test015Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test004 {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		s.add("Amar5");
		s.add("Amar1");
		s.add("Amar4");
		s.add("Amar8");
		s.add("Amar5");
		s.add("Amar8");
		
		Collections.sort(s);
		
		for(String b : s)
		{
			System.out.println(b);
		}
	}

}

package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Test121 {
	
	public static void main(String args[])
	{
		
		List<Integer> s = new ArrayList<>();

		s.add(1);

		s.add(2);

		s.add(3);

		s.add(2);

		System.out.println(s.indexOf(2));

		System.out.println(s.lastIndexOf(2));
		
		
		
	}

}

package Test015Collection.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class Test12Iterator {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Amar 1");
		s.add("Amar 2");
		s.add("Amar 3");
		s.add("Amar 4");
		s.add("Amar 5");
		
		ListIterator<String> it = s.listIterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("++++");
		
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		
	}

}

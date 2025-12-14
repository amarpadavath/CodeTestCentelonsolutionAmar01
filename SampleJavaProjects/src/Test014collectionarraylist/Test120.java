package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Test120 {
	
	public static void main(String args[])
	
	{
		List<String> s = new ArrayList<>();


		s.add("amar1");
		s.add("amar3");
		s.add(1,"amar2");

		for(String w : s)
		{
		System.out.println(w);
		}

		for(int i =0;i<s.size();i++)

		{
		System.out.println(s.get(i));
		}

		System.out.println(s) ;

		s.set(0,"I");

		System.out.println("Updated array"+s);

		}

		}
		
	

package Test015Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Test005 {
	
	public static void main(String args[])
	{
		ArrayList<Integer> s = new ArrayList<Integer>();
		
		s.add(4564);
		s.add(8);
		s.add(60);
		
		Collections.sort(s);
		
		for(int  b : s)
		{
			System.out.println(b);
		}
		
		
	}

}

package Test015Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("amar");
		
		s.add("amar1");
		
		System.out.println(s.get(0));
		
		System.out.println(s.indexOf("amar1"));
		System.out.println(s.isEmpty());
		Iterator<String> it = s.iterator();
		
		while(it.hasNext())
			
			
		{
			System.out.println();
			System.out.println(it.next());
		}
		

	}

}

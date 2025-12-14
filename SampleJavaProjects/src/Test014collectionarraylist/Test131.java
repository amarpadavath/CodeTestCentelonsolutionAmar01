package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Test131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("amar");
		s.add("amar2");
		s.add("amar3");
		s.add("amar4");
		
		s.add(0, "amar1");
		
		s.set(3, "amar456");
		
		s.remove(0);
		s.remove("amar1");
		s.clear();
		
	
		
		Collections.sort(s);
		
		System.out.println(s);
		
		for(String w : s)
		{
			System.out.println(w);
		}
		
		for(int i=0;i<=s.size()-1;i++)
		{
			System.out.println(s.get(i));
		}
	}

}

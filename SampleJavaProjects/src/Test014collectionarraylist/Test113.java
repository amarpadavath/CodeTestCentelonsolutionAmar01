package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test113 {
	
	public static void main(String args[])
	
	{
		List<String> a = new ArrayList<>();
		
		a.add("amar1");
		a.add("amar1");
		a.add("amar1");
		a.add("amar1");
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
	List<String> b = new ArrayList<>();
		
		b.add("achu1");
b.add("achu1");
		b.add("achu1");
		//b.add("achu1");
		
		Collections.copy(a, b);
		
		//System.out.println("New list os"+b);
		
	    for (int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i) + " ");
        }
	    
	    System.out.println(
	            Collections.disjoint(a, b));
	    
		
		
		
		
		
		
		
	}

}

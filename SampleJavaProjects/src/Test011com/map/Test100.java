package Test011com.map;

import java.util.HashMap;
import java.util.Map;

public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String , Integer> s = new HashMap<>();
		
		s.put("Amar",10);
		s.put("Amar1",1012);
		s.put("Amar4",1012);
		s.put("Amar2",1012);
		
		System.out.println(s);
		
	    for (Map.Entry<String, Integer> e : s.entrySet())
     {
    	 System.out.println(e.getKey() + " " + e.getValue());
    }

	}

}

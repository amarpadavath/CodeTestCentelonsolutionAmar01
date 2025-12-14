package Test020Practice;

import java.util.HashMap;
import java.util.Map;

public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> s = new HashMap<String,Integer>();
		
		s.put("amar1",1);
		s.put("amar2",2);
		s.put("amar3",3);
		
		s.remove("amar1");
		
		System.out.println(s);
		
		for(Map.Entry<String, Integer> h : s.entrySet())
		{
			System.out.println(h.getKey()+" "+h.getValue());
		}
		
		
		
		

	}

}

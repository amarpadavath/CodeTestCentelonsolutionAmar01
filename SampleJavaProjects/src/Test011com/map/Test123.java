package Test011com.map;

import java.util.HashMap;
import java.util.Map;

public class Test123 {
	
	public static void main(String args[])
	{
		
		Map<String,Integer> hm= new HashMap<String,Integer>();
		hm.put("a", 1);
		hm.put("b", new Integer(2));
		System.out.println(hm);
		for(Map.Entry<String, Integer> s : hm.entrySet())
		{
			System.out.print(s.getKey()+":");
		System.out.println(s.getValue());
			System.out.println(s.getKey()+":"+s.getValue());
			
			String key = s.getKey();
			int value = s.getValue();
			System.out.println(key+" "+value);
			
		}
		
		
	}

}

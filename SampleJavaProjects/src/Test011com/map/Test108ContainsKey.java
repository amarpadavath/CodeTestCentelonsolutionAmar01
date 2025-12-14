package Test011com.map;

import java.util.HashMap;

public class Test108ContainsKey {
	
	public static void main(String args[])
	{
		//HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		HashMap<String,String> s = new HashMap<String,String>();
		
		s.put("amar", "achu");
		s.put("amar1", "achu1");
		
		System.out.println(s);
		
		System.out.println(s.containsKey("amar"));
		System.out.println(s.containsKey("amar2"));
		System.out.println(s.containsValue("achu"));
		System.out.println(s.containsValue("achu2"));
		
		System.out.println(s.entrySet());
		
		System.out.println("i am happy");
		
		
	}

}

package Test011com.map;

import java.util.HashMap;

public class Test110 {
	
	public static void main(String args[])
	{
		HashMap<String,String> s = new HashMap<String,String>();
		
		s.put("england", "London");
		
		s.put("germany", "berlib");
		
		s.put("norwy", "oslo");
		
		System.out.println(s.get("england"));
		
	}

}

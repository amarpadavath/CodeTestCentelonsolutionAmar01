package Test011com.map;

import java.util.HashMap;

public class Test111 {
	
	public static void main(String args[])
	{
		HashMap<String,String> s = new HashMap<String,String>();
		
		s.put("amar1", "achu1");
		s.put("amar2", "achu2");
		s.put("amar3", "achu3");
		s.put("amar4", "achu4");
		
		System.out.println(s.getOrDefault("amar1", "unkniown"));
		System.out.println(s.getOrDefault("amar5", "unkniown"));
		
	}

}

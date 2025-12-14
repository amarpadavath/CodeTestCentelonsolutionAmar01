package Test011com.map;

import java.util.HashMap;

public class Test103Remove {
	
	public static void main(String args[])
	{
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("England", "London");
		map.put("England1", "London1");
		map.put("England2", "London2");
		
		System.out.println(map);
		map.clear();
		System.out.println(map);
		
	}

}

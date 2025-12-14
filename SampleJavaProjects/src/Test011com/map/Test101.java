package Test011com.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test101 {
	
	public static void main(String args[])
	{
		Map<String, Integer> map = new HashMap<>();
		
		map.put("Apple", 5);
		map.put("Apple", 5);
		map.put("Apple", 5);
		map.put("Apple1", 6);
		
		System.out.println(map);
		
		Map<String,String> map1= new HashMap<>();
		
		map1.put("amar", "achu");
		
		System.out.println(map1);
		
		Map<String,Integer> map3 = new LinkedHashMap<>();
		
		map3.put("amar", 5);
		System.out.println(map3);
		
		Map<String,Integer> map4 = new TreeMap<>();
		
		map4.put("amar", 8);
		System.out.println(map4);
		
	}

}

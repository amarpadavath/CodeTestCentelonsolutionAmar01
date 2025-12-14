package Test011com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test102 {

	public static void main(String args[]) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Apple", 5);
		map.put("Banana", 3);
		map.put("Orange", 7);
		
		System.out.println(map);

		// Accessing values based on keys
		//System.out.println("Apple: " + map.get("Apple")); // Output: Apple: 5
		System.out.println(map.get("Apple"));
		
		if(map.containsKey("Banana"))
		{
			System.out.println("map contains banana");
		}
		else
		{
			System.out.println("map does not contains");
		}
		
		map.remove("orange");
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println("key "+entry.getKey() + ",Value "+entry.getValue());
		}
		
		int value = map.get("Apple");
		
		System.out.println(value);
		//boolean hasApple = map.containsKey("Apple");
		
		boolean hasApple = map.containsKey("Apple");
		
		System.out.println(hasApple);
		//boolean hasValue5 = map.containsValue(5);
		boolean hasValue = map.containsValue(5);
		
		System.out.println(hasValue);
		//Set<String> keys = map.keySet();
		Set<String> keys = map.keySet();
		
		System.out.println(keys);
		//Collection<Integer> values = map.values();
		
		Collection<Integer> values = map.values();
		
		System.out.println(values);
		
		//Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		
		System.out.println(entries);
		
		for(Map.Entry<String, Integer> entry : map.entrySet())
		{
			System.out.println("key "+entry.getKey() + ",Value "+entry.getValue());
		}
		
		
	}

}

package Test011com.map;

import java.util.HashMap;
import java.util.Map;

public class Test124 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer> map = new HashMap<>();
		
		map.put("Amar", 1);
		map.put("Amar1", 2);
		
		System.out.println(map);
		
		for(Map.Entry<String, Integer> e : map.entrySet())
		{
			System.out.println(e.getKey()+" "+ e.getValue());
		}
			
			
			
		

	}

}

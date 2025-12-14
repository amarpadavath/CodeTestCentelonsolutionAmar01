package Test020Practice;

import java.util.HashMap;
import java.util.Map;

public class Test025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I ama amarfgfhgfhfghfgrrr";
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		
	
		char[] ch = s.toCharArray();
		
		for(char ch1: ch)
		{
			if(map.containsKey(ch1))
			{
				map.put(ch1, map.get(ch1)+1);
			}
			
			else
			{
				map.put(ch1, 0);
			}
		}
		
		int maxCount = 0;
		char maxChar= ' ';
		for(Map.Entry<Character, Integer> entry: map.entrySet())
		{
			
			if(entry.getValue()>maxCount)
			
				maxCount= entry.getValue();
			maxChar= entry.getKey();
			}
		
	
	System.out.println(maxCount+" "+maxChar);
		
		

	}

}

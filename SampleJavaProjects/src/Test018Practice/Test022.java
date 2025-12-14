package Test018Practice;

import java.util.HashMap;

public class Test022 {
	
	public static void main(String args[])
	{
		
		String s = "i am amar";
		
		
		
		char[] ch = s.toCharArray();
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(char c : ch)
		{
			
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
			
		}
		
		System.out.println(map);
		
		
	}

}

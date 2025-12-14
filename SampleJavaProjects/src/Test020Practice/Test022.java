package Test020Practice;

import java.util.HashMap;
import java.util.Map;

public class Test022 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			String s ="I am amar";
			
			HashMap<Character,Integer> map = new HashMap<Character,Integer>();
			
			char[] ch = s.toCharArray();
			
			for(char ch1: ch)
			{
				if(map.containsKey(ch1))
				{
					map.put(ch1,map.get(ch1)+1);
	
				}
				else
				{
					map.put(ch1, 1);
				}
			}
			
			System.out.println(map);
			
		for(Map.Entry<Character, Integer> s1 : map.entrySet())
		{
			if(s1.getValue()>1)
			{
				System.out.println(s1.getKey()+""+s1.getValue());
			}
		}

	}

}

package Test018Practice;

import java.util.HashMap;
import java.util.Map;

public class Test040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "I ama amar pv test deal";
		
		String s1= s.replaceAll(" ","").toLowerCase();
		
		HashMap<Character,Integer> m = new HashMap<>();
		
		char[] ch = s1.toCharArray();
		
		for(Character c : ch)
		{
			if(m.containsKey(c))
			{
				m.put(c, m.get(c)+1);
			}
			else
			{
				m.put(c, 1);
			}
		}
		
		
		for(Map.Entry<Character, Integer> entry : m.entrySet())
		{
			
			if(entry.getValue()>2)
			{
				System.out.println(entry.getKey());
				System.out.println(entry.getValue());
			}
			
		}
		
		
		

	}

}

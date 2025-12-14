package Test018Practice;

import java.util.HashMap;
import java.util.Map;

public class Test039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I ama amar";
		
		String s1= s.replaceAll(" ", "").toLowerCase();
		
		HashMap<Character,Integer> m = new HashMap<>();
		
		char[] ch = s1.toCharArray();
		
		System.out.println(ch);
		
		for(Character ch1 : ch)
		{
			if(m.containsKey(ch1))
			{
				m.put(ch1, m.get(ch1)+1);
			}
			
			else
			{
				m.put(ch1, 1);
			}
		}
		
		System.out.println(m);
		
		for(Map.Entry<Character, Integer> entry : m.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"-"+entry.getValue());
				
		}
		

	}

	}
}

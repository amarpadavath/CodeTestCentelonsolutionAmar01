package Test007interviewquestionpart1;

import java.util.HashMap;
import java.util.Set;

public class Test0042DuplicateCharacter {
	
	public static void main(String args[])
	{
		
		String a = "Amar amar o";
		
		String b = a.replaceAll("\\s+","");
		
		
		String c = b.toLowerCase();
		
		HashMap<Character,Integer> m = new HashMap<>();
		
		char[] ch = c.toCharArray();
		
		for(Character cg : ch)
		{
			if(m.containsKey(cg))
			{
				m.put(cg, m.get(cg)+1);
			}
			else
			{
				m.put(cg, 1);
			}
		}
		
		System.out.println(m);
		
		Set<Character> s = m.keySet();
		
		for(Character ch1 : s)
		{
			if(m.get(ch1)>1)
			{
				System.out.println(ch1+" "+ m.get(ch1));
				
			}
		}
		
		
		
		
		
	}

}

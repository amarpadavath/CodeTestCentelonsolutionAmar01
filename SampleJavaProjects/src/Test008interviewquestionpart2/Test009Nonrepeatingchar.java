package Test008interviewquestionpart2;

import java.util.HashMap;

public class Test009Nonrepeatingchar {
	
	public static void main(String args[])
	{
		
		String s = "weeerty";
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		char[] ch = s.toCharArray();
		
		for(char d : ch)
		{
			if(map.containsKey(d))
			{
				map.put(d, map.get(d)+1);
			}
			
			else
			{
				map.put(d, 1);
			}
		}
		
		System.out.println(map);
		
		char last = 0;
		
		for(int i = s.length()-1;i>=0;i--)
		{
			
			char t = s.charAt(i);
			if(map.get(t)==1)
			{
				
				last=t;
				break;
				
				
			}
		}
		
		System.out.println(last);
		
		
	}
	
	

}

package Test018Practice;

import java.util.HashMap;

public class Test013 {
	
	public static void main(String args[])
	{
		
		String s = "I am amar";
		
		HashMap<Character,Integer> w = new HashMap<Character,Integer>();
		
		char[] array = s.toCharArray();
		
		for(char c : array)
		{
			if(w.containsKey(c))
			{
				w.put(c,w.get(c)+1);
			}
			
			else
			{
				w.put(c,1);
			}
		}
		System.out.println(w);
		
		
		
		
	}

}

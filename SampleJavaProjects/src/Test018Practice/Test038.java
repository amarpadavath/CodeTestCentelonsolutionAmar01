package Test018Practice;

import java.util.HashMap;

public class Test038 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = "I am amar";
		
		String s1=s.replaceAll("\\s","").toLowerCase();
		
		HashMap<Character,Integer> m = new HashMap<Character,Integer>();
		
		char[] ch = s1.toCharArray();
		
		for(char c : ch)
		{
			
			if(m.containsKey(c))
			{
				m.put(c,m.get(c)+1);
			}
			
			else
			{
				m.put(c,1);
			}
			
		}
		
		System.out.println(m);

	}

}

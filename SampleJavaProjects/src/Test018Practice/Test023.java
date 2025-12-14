package Test018Practice;

import java.util.HashMap;

public class Test023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am amar";
		
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
		
		//char[] ch = s.toCharArray();
		
		char ch1 = s.charAt(i);
		
		if(ch1=='a')
		{
			map.put(ch1, map.get(ch1)+1);
		}
		
		else
		{
			map.put(ch1, 1);
		}
		
		
		
		}
		System.out.println(map);
		
		
	}

}

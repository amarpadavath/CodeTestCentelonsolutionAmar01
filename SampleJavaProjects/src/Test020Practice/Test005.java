package Test020Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		{
			
			String s = "Idxgvxzvcxveeeeeew";
			
			HashMap<Character,Integer> map = new HashMap<>();
			
			char[] arr = s.toCharArray();
			
			for(char ch : arr)
				
				{
					
					if(map.containsKey(ch))
					{
						map.put(ch,map.get(ch)+1);
					}
					
					else
					{
						map.put(ch,1);
					}
					
					
				}
				
				System.out.println(map);
				
				for(Map.Entry<Character,Integer> s1 : map.entrySet())
				{
					
					System.out.print(s1.getKey());
					System.out.println(s1.getValue());
				}
				
				Set<Character> charCount = map.keySet();
				
				for(char ch : charCount)
				{
					if(map.get(ch)>1)
					{
						
						System.out.print(ch+" " );
						System.out.println(map.get(ch));
					}
					
					
				}
			
			
			
			
			
		}

	}

}

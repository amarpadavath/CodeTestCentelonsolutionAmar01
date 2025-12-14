package Test018Practice;

import java.util.HashMap;
import java.util.Map;

public class Test014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I am amar";
		
	
		
		char[] ch = s.toCharArray();
		
		HashMap<Character,Integer> w = new HashMap<>();
		
		for(char c : ch)
		{
			 if (c == ' ') {  // skip space
	                continue;
	            }

			if(w.containsKey(c))
				
			{
				w.put(c, w.get(c)+1);
			}
			else
			{
				w.put(c,1);
			}
		}
		
		System.out.print(w);
		
		  // print only duplicates
        System.out.println("Duplicate characters:");
        for (Map.Entry<Character, Integer> entry : w.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → " + entry.getValue());
            }
        }
		

	}

}

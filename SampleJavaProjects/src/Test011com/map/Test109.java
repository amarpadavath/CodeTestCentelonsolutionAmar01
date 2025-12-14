package Test011com.map;

import java.util.HashMap;

public class Test109 {
	
	public static void main(String args[])
	{
		 // HashMap<String, String> capitalCities = new HashMap<String, String>();
		HashMap<String,String> s = new HashMap<String,String>();
		    s.put("England", "London");
		    s.put("Germany", "Berlin");
		    s.put("Norway", "Oslo");
		    s.put("USA", "Washington DC");
		    s.forEach( (k, v) -> { System.out.println(k + " -> " + v); } );
	}

}

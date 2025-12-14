package Test011com.map;

import java.util.HashMap;

public class Test107 {
	
	public static void main(String args[])
	{
		  HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    capitalCities.computeIfPresent("England", (k, v) -> v + "(" + k + ")");
		    
		    System.out.println(capitalCities);
	}

}

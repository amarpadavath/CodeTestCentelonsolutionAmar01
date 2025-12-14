package Test011com.map;

import java.util.HashMap;

public class Test117 {
	
	public static void main(String args[])
	{
		  HashMap<String, String> capitalCities = new HashMap<String, String>();

		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    // Add new entries only if they don't exist
		    capitalCities.putIfAbsent("Canada", "Ottawa");
		    capitalCities.putIfAbsent("England", "Cambridge");
		    capitalCities.putIfAbsent("amar", "achu");
		    System.out.println(capitalCities);
	}

}

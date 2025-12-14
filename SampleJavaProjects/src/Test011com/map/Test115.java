package Test011com.map;

import java.util.HashMap;

public class Test115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  HashMap<String, String> capitalCities = new HashMap<String, String>();
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    HashMap<String, String> moreCities = new HashMap<String, String>();
		    moreCities.put("Canada", "Ottawa");
		    moreCities.put("Japan", "Tokyo");
		    
		    capitalCities.putAll(moreCities);
		    
		    
		    //capitalCities.putAll(moreCities);
		    System.out.println(capitalCities);

	}

}

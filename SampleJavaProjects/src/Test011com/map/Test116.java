package Test011com.map;

import java.util.HashMap;

public class Test116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> capitalCities = new HashMap<String,String>();
		
		  capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    capitalCities.remove("USA");
		    
		    capitalCities.remove("Germany", "Berlin");
		    capitalCities.remove("England", "Cambridge");
		    
		    System.out.println(capitalCities);
		

	}

}

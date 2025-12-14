package Test011com.map;

import java.util.HashMap;

public class Test118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> capitalCities = new HashMap<String, String>();
		  capitalCities.put("England", "Cambridge");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    
		    capitalCities.replace("England", "London");
		    capitalCities.replace("Canada", "Ottawa");
		    capitalCities.replace("USA", "New York", "Washington DC");
		    
		    System.out.println(capitalCities);
		    
		    

	}

}

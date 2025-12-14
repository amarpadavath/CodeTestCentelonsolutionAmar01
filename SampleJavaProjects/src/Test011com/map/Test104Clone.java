package Test011com.map;

import java.util.HashMap;

public class Test104Clone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("amar");		
		
		HashMap<String ,String> map1= new HashMap<String,String>();
		
		map1.put("England", "London4");
		
		map1.put("England1", "lan1");
		map1.put("England2", "lan2");
		map1.put("England3", "lan3");
		
		System.out.println(map1);
		
		HashMap copy = (HashMap)map1.clone();
		 copy.remove("England");
		 
		 System.out.println(map1);
		  System.out.println(copy);
		  
		  //System.out.println("i am amar");		 
		 // System.out.println("i am amar1");	
		 // System.out.println("nmbhj");
		 // System.out.println("ama");
		
		
		

	}

}

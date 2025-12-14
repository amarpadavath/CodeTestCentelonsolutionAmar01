package Test019Practice;

import java.util.HashSet;
import java.util.Iterator;

public class Test037 {
	
	public static void main(String args[])
	{
		HashSet<String> cars = new HashSet<>();
		
		//HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");  // Duplicate
	    cars.add("Mazda");
	    System.out.println(cars);
	    
	    Iterator<String> it = cars.iterator();
	    
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	  
	}
}



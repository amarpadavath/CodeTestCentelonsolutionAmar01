package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test20Array {
	
	public static void main(String args[])
	{
		 ArrayList cars = new ArrayList();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    Object[] carAry = cars.toArray();
		    
		    System.out.println(cars);
		   // System.out.println(carAry);
		    
		    
		    for(Object item : carAry)
		    {
		    	System.out.println(item);
		    }
		    
	}

}

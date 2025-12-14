package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test007Clone {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("Amar1");
		s.add("Amar2");
		s.add("Amar3");
		
		ArrayList b = (ArrayList)s.clone();
		
		b.set(0, "sanoop");
		
		System.out.println(s);
		System.out.println(b);
		
		//ArrayList s = (ArrayList)s.clone();
		
		
		
		
	/*	import java.util.ArrayList;

		public class Main {
		  public static void main(String[] args) {
		    ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    
		    ArrayList cars2 = (ArrayList)cars.clone();
		    cars2.set(0, "Toyota");
		    
		    System.out.println(cars);
		    System.out.println(cars2);
		  }
		}
		*/
		
		
	}

}

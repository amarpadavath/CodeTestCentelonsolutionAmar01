package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test011 {

	public static void main(String args[]) {
		ArrayList<String> cars = new ArrayList<String>();

		cars.add("Volvo");
		cars.add("Ford");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		
		System.out.println(cars.indexOf("Ford"));
		System.out.println(cars.lastIndexOf("Ford"));
		System.out.println(cars.lastIndexOf("ford"));//if items are not found in list, it is -1
	}

}

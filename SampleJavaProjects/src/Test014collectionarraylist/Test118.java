package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public abstract class Test118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s = new ArrayList<>();

		s.add("java");
		s.add("java1");
		s.add("java2");
		s.add("java3");

		System.out.println("Elements in list are :");

		for(String s1 : s)
		{
		System.out.println(s1);
		}


		System.out.println("accesing webelement"+s.get(1));

	
	
	

		

	 s.set(1, "JavaScript");
     System.out.println("Updated List: " + s);

		s.remove("java3");

		System.out.println("List after removong elemenet"+s);
		
		
		
		

	


}
}

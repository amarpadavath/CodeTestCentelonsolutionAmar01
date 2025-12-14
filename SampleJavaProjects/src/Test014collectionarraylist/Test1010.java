package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// List<String> l = new ArrayList<>();
		
		List<String> a = new ArrayList<>();
		
		a.add("Shoes");
		a.add("Toys");
		
		Collections.addAll(a, "fruits","Bat","Ball");
		
		for(int i =0;i<=a.size()-1;i++)
		{
			System.out.println(a.get(i)+ " ");
		}
		

	}

}

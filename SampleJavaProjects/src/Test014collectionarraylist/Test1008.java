package Test014collectionarraylist;

import java.util.ArrayList;

public class Test1008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();

		s.add("Apple");

		s.add("Banana");

		s.add("Apple");

		System.out.println("arra is "+s);
		
		for(int i =0;i<=s.size()-1;i++)
		{
			System.out.println(s.get(i));
		}
	}

}

package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Test122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s = new ArrayList<>();

		s.add("geeks");

		s.add("geeks");

		s.add(1,"for");

		System.out.println(s);

		s.remove(1);

		System.out.println(s);

		s.remove("geeks");

		System.out.println(s);


	}

}

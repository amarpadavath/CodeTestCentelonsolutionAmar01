package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.List;

public class Test125

{

	public static void main(String arg[])

	{

		List<Integer> s = new ArrayList<Integer>(5);

		for (int i = 1; i <= 5; i++) {

			s.add(i);

		}

		System.out.println(s);

		s.remove(3);

		System.out.println(s);

		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i) + " ");

		}

	}

}
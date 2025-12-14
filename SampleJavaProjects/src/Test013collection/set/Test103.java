package Test013collection.set;

import java.util.HashSet;
import java.util.Set;

public class Test103 {

	public static void main(String args[])

	{

		Set<String> hs = new HashSet<String>();

		hs.add("B");
		hs.add("B");
		hs.add("C");
		hs.add("A");

		System.out.println(hs);

	}

}
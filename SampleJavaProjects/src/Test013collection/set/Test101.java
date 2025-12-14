package Test013collection.set;

import java.util.HashSet;
import java.util.Set;

public class Test101 {

	public static void main(String args[])

	{

		Set<String> s = new HashSet<>();

		s.add("amar");
		s.add("amar1");
		s.add("amar");
		s.add("amar3");

		System.out.println("Set is ...." + s);
		 // Declaring object of type String 
        Set<String> hash_Set = new HashSet<String>();

        // Adding elements to the Set
        // using add() method
        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        // Printing elements of HashSet object
        System.out.println(hash_Set);
	}

}

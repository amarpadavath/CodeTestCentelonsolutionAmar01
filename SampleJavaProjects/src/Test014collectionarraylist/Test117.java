package Test014collectionarraylist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Test117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
        // Create and populate the list
        Collection<String> l = new LinkedList<>();

        l.add("Geeks");
        l.add("for");
        l.add("Geeks");

        // Displaying the list
        System.out.println("The list is:" + l);

        // Create an iterator for the list
        // using iterator() method
        Iterator<String> it = l.iterator();

        // Displaying the values after iterating
        // through the list
        System.out.println("\nThe iterator values" + " of list are: ");
        while (it.hasNext()) {
            System.out.print(it.next() + " ");

	}
        
	}
	
}



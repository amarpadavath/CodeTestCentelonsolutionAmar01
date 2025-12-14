package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1011 {

    public static void main(String[] args) {
        List<String> s = new ArrayList<>();

        s.add("Shoes");
        s.add("Toys");

        // Adding multiple elements to the list
        Collections.addAll(s, "a", "b", "c");

        // Sorting the list in ascending order
        Collections.sort(s);

        // Displaying the sorted list
        System.out.println("Sorted list:");
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i) + " ");
        }

        // Sorting the list in reverse order
        Collections.sort(s, Collections.reverseOrder());

        // Displaying the reverse sorted list
        System.out.println("\nReverse sorted list:");
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i) + " ");
        }
    }
}

package Test014collectionarraylist;

import java.util.Hashtable;
import java.util.Vector;

public class Test1004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  
		  int arr[] = new int[]  { 1,2,3,4 };
		//int arr[] = new int[] { 1, 2, 3, 4 };
		  
		  Vector<Integer> v = new Vector();
		  Hashtable<Integer, String > h = new Hashtable();
		  
		  v.addElement(1);
		  v.addElement(2);
		  
		  h.put(0,"amar");
		 h.put(2,"cheenu");
		 
		 System.out.println(arr[3]);
		 System.out.println(v.elementAt(1));
		 System.out.println(h.get(0));

	}

}

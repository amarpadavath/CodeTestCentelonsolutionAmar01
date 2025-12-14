package Test014collectionarraylist;

import java.util.LinkedList;

public class Test1006 {
	
	public static void main(String args[])
	{
	
		  LinkedList<Integer> a = new LinkedList<Integer>();

	for(int i =1; i<=5;i++)
	{
		a.add(i);
	}
	
	System.out.println(a);
	
	a.remove(3);
	
	System.out.println(a);
	
	for(int i =0;i<a.size()-1 ;i++)
	
	{
	System.out.println(a.get(i)+" ");
	}
	

}
}

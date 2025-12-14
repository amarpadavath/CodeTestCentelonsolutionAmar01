package Test013CollectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test001 {
	
	public static void main(String args[])
	{
		Set<String> s = new HashSet<String>();
		
		s.add("amar");
		s.add("amar");
		
		System.out.println(s);
		
		HashSet<String> s1 = new HashSet<String>();
		
		s1.add("amar1");
		s1.add("ama1r");
		//s1.remove("amar1");
		System.out.println(s1);
		//boolean contains = hashSet.contains("Element1");
		boolean contains = s1.contains("amar1");
		System.out.println(contains);
		
		//int size = hashSet.size();
		int size = s1.size();
		System.out.println(size);
		//boolean isEmpty = hashSet.isEmpty();
		boolean isEmpty = s1.isEmpty();
		System.out.println(isEmpty);
		Set<String> s2  = new LinkedHashSet<String>();
		
		Set<String> treeSet = new TreeSet<>();
		
		
		
		
	}

}

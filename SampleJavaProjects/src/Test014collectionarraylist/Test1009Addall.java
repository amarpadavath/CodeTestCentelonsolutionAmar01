package Test014collectionarraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1009Addall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s = new ArrayList<String>();

		s.add("i am");

		s.add(" amar");

		Collections.addAll(s," and " ,"i am ","poweful");

		System.out.println(s);

		for(int i=0;i<s.size()-1;i++)
		{
		System.out.println(s.get(i)+  " ");
		}

	}

}

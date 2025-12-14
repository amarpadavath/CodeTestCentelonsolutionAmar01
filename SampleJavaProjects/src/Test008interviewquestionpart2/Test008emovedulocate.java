package Test008interviewquestionpart2;

import java.util.ArrayList;
import java.util.HashSet;

public class Test008emovedulocate {
	
	public static void main(String args[])
	{

	ArrayList<String> s = new ArrayList<String>();

	s.add("amar");
	s.add("amar");
	s.add("amar");

	HashSet<String> b = new HashSet<>(s);

	System.out.println(b);

	ArrayList d = new ArrayList<>(b);
	System.out.println(d);


	}


}

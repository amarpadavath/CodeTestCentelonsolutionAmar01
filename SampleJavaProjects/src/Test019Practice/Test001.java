package Test019Practice;

import java.util.ArrayList;
import java.util.HashSet;

public class Test001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> s = new ArrayList<String>();

		s.add("amar");
		s.add("amar");
		s.add("amar1");

		HashSet<String> b = new HashSet<>(s);

		System.out.println(b);

		ArrayList d = new ArrayList<>(b);
		System.out.println(d);

	}

}

package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test13RemveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			ArrayList<Integer> s = new ArrayList<Integer>();
			
			s.add(10);
			s.add(11);
			s.add(12);
			s.add(13);
			s.add(14);
			s.removeIf(n->n%2==0);
			System.out.println(s);
			
		

	}

}

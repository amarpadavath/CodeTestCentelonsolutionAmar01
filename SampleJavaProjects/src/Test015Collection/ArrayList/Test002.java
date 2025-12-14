package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test002 {
	
	public static void main(String args[])
	{
		ArrayList<String> s = new ArrayList<String>();
		
		s.add("xcxc");
		s.add("xcxc1");
		s.add("xcxc2");
		s.add(0, "amar");
		s.add(4, "56456");
		System.out.println(s);
		
		System.out.println(s.get(0));
		
		s.set(4, "amar");
		System.out.println(s);
		
		s.remove(0);
		
		System.out.println(s);
		//s.clear();
		System.out.println(s.size());
		
		for(String r : s)
		{
			System.out.println(r);
		}
		
		for(int i=0;i<=s.size()-1;i++)
		{
			System.out.println(s.get(i));
		}
		
		
	}

}

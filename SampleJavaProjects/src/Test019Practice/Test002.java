package Test019Practice;

import java.util.HashSet;

public class Test002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] s1 =  { "Amar","Achu"};
		String[] s2 = { "Amar1","Achu"};
		
		HashSet<String> set = new HashSet<>();
		
		for(int i=0;i<s1.length;i++)
		{
			
		for(int j=0;j<s2.length;j++)
		{
			if(s1[i]==s2[j])
			{
				set.add(s1[i]);
			}
		}
		
		System.out.println(set);
			
		
	}

	}

}

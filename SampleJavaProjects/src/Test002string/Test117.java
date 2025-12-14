package Test002string;

import java.util.Scanner;

public class Test117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		String s = scn.next();
		
		int count = 0 ;
		
		int t = s.length();
		
		for(int i =0; i<t;i++)
		{
			char ch = s.charAt(i);
			
			if(ch =='a'|| ch =='e'||ch =='i'||ch =='o'||ch =='u')
			{
				count++;
			}
		}
		
		System.out.println(count);
		
		

	}

}

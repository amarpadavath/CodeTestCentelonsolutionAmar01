package Test018Practice;

public class Test002 {

public static void main(String args[])
		{
			String s  = "I am amar";
			
			int count = 0;
			
			int x = s.length();
			
			for(int i=0;i<x;i++)
			{
				char ch = s.toLowerCase().charAt(i);
				
				if(ch=='a'|| ch=='e')
					{
					
					System.out.println(i+" "+ch);
					count++;
				}
			}
			
			System.out.println(count);
			
			
			
			
		}
		
	}
		
	




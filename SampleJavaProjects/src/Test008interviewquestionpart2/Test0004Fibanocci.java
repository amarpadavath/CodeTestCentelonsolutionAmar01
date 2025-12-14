package Test008interviewquestionpart2;

public class Test0004Fibanocci {
	
	public static void main(String args[])
	{
		
		int first =0;
		int second = 1;
		int x = 10;
		int third;
		
		for(int i =1;i<=x;i++)
		{
			System.out.print(first+" ");
			 third = first + second ;
			 
			 first = second;
			 second= third;
			
		}
		
	}

}

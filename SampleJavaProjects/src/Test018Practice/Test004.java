package Test018Practice;

public class Test004 {
	
	public static void main(String args[])
	{
		
		int x = 13;
		
		boolean isPrime = true;
		
		if(x<=1)
		{
			System.out.println("It is not prime no");
			return ;
			
		}
		
		for(int i=2; i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
				
				
			{
			
				isPrime= false;
				break;
			}
			
		}
		
		if(isPrime)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("It is not prime no");
		}
		
		
	}

}

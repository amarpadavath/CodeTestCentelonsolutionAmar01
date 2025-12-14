package Test018Practice;

public class Test025 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 15;
		if(x<=1)
		{
			System.out.println("not prime");
		}
		
		else
		{
			
			boolean isprime=true;
		
		for(int i =2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				
				isprime=false;
				break;
			}
			
			
		}
		if(isprime)
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("nono");
		}

	}
		
	}

}

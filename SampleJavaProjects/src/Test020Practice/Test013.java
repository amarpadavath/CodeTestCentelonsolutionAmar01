package Test020Practice;

public class Test013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x  = 7;
		
	//	boolean isPrime = true;
		
		if(isPrime(x))
		{
			System.out.println("prime");
		}
		else
		{
			System.out.println("not prime");
		}
	}
		
		
		public static boolean isPrime(int x)
		{
		
		for(int i = 2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				return false;
			}
			return true;
			
		}
		return true;

	}
	

}

package Test020Practice;

public class Test014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 7;
		
		boolean isPrime= true;
		
		if(x<=1)
		{
			System.out.println("not prime");
		}
		
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
			{
				isPrime= false;
				break;
			}
			
			isPrime= true;
		}
		
		if(isPrime==true)
		{
			System.out.println("Prime no");
		}
		else
		{
			System.out.println("Not prime moi");
		}

	}

}

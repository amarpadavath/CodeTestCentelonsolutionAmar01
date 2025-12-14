package Test020Practice;

public class Test021 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 153;
		
		int original= x;
		
		int d= String.valueOf(x).length();
		
		int sum =0;
		
		while(x>0)
		{
			int digit = x%10;
			
			  sum+=Math.pow(digit, d);
			
			x=x/10;
			
			
		}
		
		if(sum==original)
		{
			System.out.println("arm storng");
		}
		else
		{
			System.out.println("not");
		}

	}

}

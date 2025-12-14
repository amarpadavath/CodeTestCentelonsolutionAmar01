package Test020Practice;

public class Test008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x= 103;

		int rev=0;

		int num =x;

		while(x!=0)
		{
		int digit = x%10;

		rev = rev*10+ digit;
		x = x/10;


	}
		
		System.out.println(rev);
	}

}

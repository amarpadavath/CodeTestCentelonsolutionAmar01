import java.util.Scanner;

public class Test13Method1 {
	
	public static void main(String args[])
	{
		Test13Method1 obj = new Test13Method1();
		
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		int s = obj.addTwoInt(a, b);
		System.out.println("sum is "+s);
	}
	
	public int addTwoInt(int a, int b)
	
	{
		
		
		int sum;
		 sum = a + b ;
		 
		 return sum;
	}

}

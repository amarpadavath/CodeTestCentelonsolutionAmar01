import java.util.Scanner;

public class Test10NoReturn {
	
	public static void main(String args[])
	{
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		new Test10NoReturn().demoSum(a, b);
	}
	
	 void demoSum(int a, int b)
	 {
		 int sum = a +b ;
		 
		 System.out.println("sum is"+ sum);
	 }

}

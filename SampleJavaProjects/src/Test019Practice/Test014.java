package Test019Practice;

public class Test014 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(plusMethod(10,20));
		System.out.println(plusMethod(10.5, 20.2));
		System.out.println(plusMethod("I am amar"));

	}
	
	static int plusMethod(int x , int y)
	{
		return x +y;
		
	}
	
	static double plusMethod(double x, double y)
	{
		return x + y;
	}
	
	static String plusMethod(String s)
	{
		return s ;
	}

}

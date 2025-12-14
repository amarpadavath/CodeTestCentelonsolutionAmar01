package Test019Practice;

public class Test005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 200;
		int b = 33;
		int c = 500;
		
		if(a>b||a>c) 
		{
			System.out.println("One condition is true");
		}
		else if (a > b && c > a) {
			  System.out.println("Both conditions are true");
			}
		
		if (!(a > b)) {
			  System.out.println("a is NOT greater than b");
			}

	}

}

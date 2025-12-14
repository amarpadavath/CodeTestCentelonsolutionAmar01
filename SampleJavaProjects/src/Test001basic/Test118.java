package Test001basic;

public class Test118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int a = 10 / 0; // ArithmeticException
		 
		 try {
			    int b = 10 / 0;
			} catch (ArithmeticException e) {
			    System.out.println("Error: " + e.getMessage());
			}
		 finally {
			 System.out.println("This block always executes");
			 }
	}

}

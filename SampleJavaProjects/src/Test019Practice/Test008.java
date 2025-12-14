package Test019Practice;

public class Test008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Outer loop
		for (int i = 1; i <= 2; i++) {
		  System.out.println("Outer: " + i); // Executes 2 times
		  
		  // Inner loop
		  for (int j = 1; j <= 3; j++) {
		    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
		  }
		} 
		
		int[] numbers = {10, 20, 30, 40};

		for (int num : numbers) {
		  System.out.println(num);
		}
	}
	
	

}

package Test020Practice;

public class Test006 {

	 public static void main(String[]args) {

	        int x = 50; // upper limit

	        for (int num = 2; num <= x; num++) { // check every number from 2 to x
	            boolean isPrime = true;

	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }

	            if (isPrime) {
	                System.out.print(num + " "); // print prime
	            }
	        }
	    }
}

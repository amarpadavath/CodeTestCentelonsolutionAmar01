package Test007interviewquestionpart1;



public class Test0031PrimeNoBetweenTwonos {

    public static void main(String args[]) {
        int start = 10;
        int end = 50;

        // Iterate through all numbers from start to end
        for (int num = start; num <= end; num++) {
            boolean isPrime = true;  // Assume the current number is prime

            // Check if num is divisible by any number up to the square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {  // If divisible, it's not a prime
                    isPrime = false;
                    break;  // Exit the loop early since we found a divisor
                }
            }

            // Print the number if it is prime and greater than 1
            if (isPrime && num > 1) {
                System.out.print(num + " ");
            }
        }
    }
}


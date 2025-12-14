package Test007interviewquestionpart1;

public class Test0041StarRightAngledTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

        // Input number of rows
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line
            System.out.println();

        }

}
}

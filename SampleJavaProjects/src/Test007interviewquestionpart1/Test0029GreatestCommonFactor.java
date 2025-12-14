package Test007interviewquestionpart1;

public class Test0029GreatestCommonFactor {

	public static void main(String args[]) {

		int a = 60;
		int b = 48;

		while (b != 0) {
			int temp = b;
			//temp=48  b=12 a=48
			//temp=12  b=0, a=12
			b = a % b;

			a = temp;
		}

		System.out.println(a);

	}

}

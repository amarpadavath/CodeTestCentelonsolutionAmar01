package Test015Collection.ArrayList;

import java.util.ArrayList;

public class Test009forEach {

	public static void main(String args[]) {

		ArrayList<Integer> num = new ArrayList<Integer>();

		num.add(5);
		num.add(9);
		num.add(5);
		num.add(1);
		num.forEach((n) -> {
			System.out.println(n);
		});

	}

}

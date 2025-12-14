package Test008interviewquestionpart2;

import java.util.Arrays;

public class Test0005Anagrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "Listen";

		String s2 = "Silent";

		s1 = s1.replaceAll("\\s", "").toLowerCase();

		s2 = s1.replaceAll("\\s", "").toLowerCase();

		if (s1.length() == s2.length()) {
			char arr1[] = s1.toCharArray();

			char arr2[] = s2.toCharArray();
			
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			System.out.println(arr1);
			System.out.println(arr2);
			
			if(Arrays.equals(arr1, arr2))
			{
				System.out.println("anagrame");
			}
			else
			{
				System.out.println("not");
			}
				

		}
		else
		{
			System.out.println("not");
		}

	}

}

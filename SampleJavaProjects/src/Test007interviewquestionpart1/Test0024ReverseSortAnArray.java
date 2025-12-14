package Test007interviewquestionpart1;

import java.util.Arrays;
import java.util.Comparator;

public class Test0024ReverseSortAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  arrays[] = {5,1,4,2,3};
		
		Arrays.sort(arrays);
		
		reverse(arrays);
		
		System.out.println("sort"+Arrays.toString(arrays));
		
		int s[] = {1,8,5,6};
		
		s = Arrays.stream(s).boxed().sorted(Comparator.reverseOrder())
				.mapToInt(Integer::intValue)  // Convert Stream<Integer> back to int[]
                .toArray();  // Collect the result as int[]
		
		System.out.println("Sorted array in descending order" +Arrays.toString(s));
			

	}

	private static void reverse(int[] arrays1) {
		// TODO Auto-generated method stub
		int start =0;
		int end = arrays1.length-1;
		
		while(start<end)
		{
			int temp = arrays1[start];
			
			arrays1[start] = arrays1[end];
			
			arrays1[end] = temp;
			
			start++;
			end--;
			
		}
	}

}

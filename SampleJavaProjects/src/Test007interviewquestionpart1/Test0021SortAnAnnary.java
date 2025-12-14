package Test007interviewquestionpart1;

import java.util.Arrays;
import java.util.Collections;

public class Test0021SortAnAnnary {
	
	public static void main(String args[])
	{
		int arr[] = {10,40,30};
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		String[] names = {"charlie","Alice","bob"};
		
		Arrays.sort(names);
		
		System.out.println("Sorted Array "+Arrays.toString(names));
		
		// decsencending order sort
		
		Integer array[] = {5,1,4,2,3};
		
		Arrays.sort(array, Collections.reverseOrder());
		
		System.out.println("sorted array in deccendimg order" + Arrays.toString(array));
		
		
		
		
		
	}

}

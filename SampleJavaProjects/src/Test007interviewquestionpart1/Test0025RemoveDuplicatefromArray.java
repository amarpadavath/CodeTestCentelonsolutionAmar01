package Test007interviewquestionpart1;

import java.util.HashSet;

public class Test0025RemoveDuplicatefromArray {
	
	public static void main(String args[])
	{
		int arr[] = {1,2,2,3,4,4};
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		for(int num : arr)
		{
			set.add(num);
		}
		System.out.println(set);
	}

}

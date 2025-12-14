package Test012com.array;

import java.util.Arrays;

public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= { 6546545,84684,5645,5555};
		
		System.out.println(Arrays.toString(arr));
		
		int x = arr.length;
		
		for(int  i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		  for (int num : arr) {
	            System.out.print(num + " ");
	        }
		  
		    int arr1[][] = {
		            {1, 2, 3},
		            {4, 5, 6},
		            {7, 8, 9}
		        };
		        System.out.println(Arrays.deepToString(arr1));
		  
		  

	}

}

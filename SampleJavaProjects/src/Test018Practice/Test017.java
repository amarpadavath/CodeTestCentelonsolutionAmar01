package Test018Practice;

import java.util.Arrays;

public class Test017 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String arr[]= {"amar8","amar2","amar3"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int arr1[]= {72,1,5,5,18};
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Max(arr1));
		
		
	}
		
		
		public static int Max(int[] arr)
		{
			int maximum = arr[0];
			for(int i=0;i<arr.length;i++)
				 
			{
				if(arr[i]>maximum)
				{
					maximum=arr[i];
				}
				
			}
			return maximum;
			
		}
		
		
		
		

	

}

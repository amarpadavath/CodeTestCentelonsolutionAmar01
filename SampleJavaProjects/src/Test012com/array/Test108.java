package Test012com.array;

public class Test108 {

	
		public static void main(String args[])
		{
			int arr[]={1,2,3,4};
			
			sum(arr);
			
		}
		
		public static void sum(int[] arr1)
		{
			int sum =0;
			 for (int i = 0; i < arr1.length; i++)
	            sum += arr1[i];

	        System.out.println("sum of array values : " + sum);
			
			
		}
		
		
		
		
	}




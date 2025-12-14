
public class Test2FindMaximumArray {
	
	public static void main(String arg[])
	{
		int arr[] = { 123, 345,4555};
		
		int max = findMax(arr);
		
		System.out.println("maximum numver "+ max);
		
	}

	public static int findMax(int[] arr) {
		// TODO Auto-generated method stub
		
		int maximum = arr[0];
		
		for(int n1 : arr )
		 {
			 if(n1> maximum)
			 {
				 maximum = n1;
			 }
		 }
		return maximum;
	}

}

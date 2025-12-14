package Test012com.array;

public class Test110 {

	public static void main(String args[])
	{
		
		int[] arr = {20,80,30};
		
		int t=max(arr);
		System.out.println(max(arr));
		
	}
	
	public static int max(int arr[])
	
	{
		int maximum = arr[0];
		for(int x : arr)
		{
			if(x>maximum)
			{
				maximum=x;
			}
			
		}
		
		return maximum;
		
	}
}

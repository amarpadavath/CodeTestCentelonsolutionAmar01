package Test019Practice;

public class Test038 {
	
	public static void main(String args[])
	{
		
		int[] test = {10,50,60,11};
		
		int x = findMax(test);
		
		System.out.println(x);
		
		
		
		
		
	}
	
	public static int findMax(int[] arr)
	{
		
		int maximum= arr[0];
		
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

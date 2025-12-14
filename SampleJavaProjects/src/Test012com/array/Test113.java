package Test012com.array;

import java.util.Arrays;

public class Test113 {

	public static void main(String args[])
	{
		
		int[] s = { 10,20,63};
		
		int x = max(s);
		System.out.println(x);
		
		System.out.println(s);
		System.out.println(s.toString());
		
	}
	
	public static int max(int arr[])
	{
		int max = arr[0];
		for(int x : arr)
		{
			if(x>max)
			{
				max=x;
			}
			
		}
		return max;
		
	}

}

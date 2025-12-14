package Test018Practice;

public class Test016 {
	
	public static void main(String args[])
	{
		int[] arr = { 40,30,50};
		
		sum(arr);
	}

	public static void sum(int[] s)
	{
		
		int sum =0;
		for(int i=0;i<s.length;i++)
		{
			sum= sum+s[i];
		}
		
		System.out.println(sum);
	}
	
}

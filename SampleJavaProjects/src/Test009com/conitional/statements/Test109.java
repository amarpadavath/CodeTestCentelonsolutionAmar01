package Test009com.conitional.statements;

public class Test109 {
	
	public static void main(String args[])
	{
		int s[] = {48,65,42,95};
		
		int max = findMax(s);
		
		System.out.println(max);
}

	public  static int findMax(int[] q) {
		
		int maximum = q[0];
		
		for(int n : q )
		{
			if(n>maximum)
			{
				maximum=n;
			}
		}
		
		return maximum;
	}
}

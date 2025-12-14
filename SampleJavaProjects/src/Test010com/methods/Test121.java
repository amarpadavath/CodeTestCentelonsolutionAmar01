package Test010com.methods;

public class Test121 {
	
	public static void main(String args[])
	{
		int result = sum(10);
		
		System.out.println(result);
		
	}

	private static int sum(int k) {
		//int k;
		// TODO Auto-generated method stub
		if(k>0)
		{
			return k + sum(k-1);
		}
		else
		{
		return 0;
		}
	}

}

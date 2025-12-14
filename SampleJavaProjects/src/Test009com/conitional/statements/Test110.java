package Test009com.conitional.statements;

public class Test110 {
	
	public static void main(String arg[])
	{
		 int s[] = {455,844646,6465465,65465165};
		 
		 int max = findMax(s);
		 
		 System.out.println(max);
		 
		 }
	
	public static int findMax(int q[])
	{
		int maximum = q[0];
		
		for(int n : q)
			
		{
			if(n>maximum)
			maximum= n;
		}
		
		
		return maximum;
		
	}

}

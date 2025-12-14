package Test009com.conitional.statements;

public class Test119 {
	
	public static void main(String arg[])
	{
		System.out.println(new Test119().avg(5.5, 6.5));
		System.out.println(new Test119().avg(5, 6));
	}
	
	double avg(double x, double y)
	{
		double res= (x+y) /2.0 ;
				
				return res;
	}
	
	int avg(int x, int y)
	{
		int res=  ((x+y))  ;
		
		return res;
	}

}

package Test009com.conitional.statements;

public class Test121 {
	
	public static void main(String args[])
	{
		Test121 obj = new Test121();
		obj.check(5.5);
		System.out.println("program executed successfully");
	}
	
	void check(double v)
	{
		
		if(v<9)
		{
			return ;
		}
		v++;
	
	}

}

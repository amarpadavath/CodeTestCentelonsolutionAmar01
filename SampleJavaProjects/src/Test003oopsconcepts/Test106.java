package Test003oopsconcepts;

public class Test106 {
	
	static String Employee_name ;
	
	 static double Employee_salary;
	
	
	static void set(String n, double d)
	{
		Employee_name = n;
		
		Employee_salary = d;
		
		
	}
	
	static void get()
	{
		System.out.println("Emplyee name is "+Employee_name);
		
		System.out.println("Emplyee name is "+Employee_salary);
	}
	
	public static void main(String args[])
	
	
	{
		
		Test106.set("amar pv", 10000.0);
		
		Test106.get();
		
	}

}

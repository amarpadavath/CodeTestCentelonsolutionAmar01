package Test004oopsconcepts2;

public class Test022 {
	
	static void myMethod()
	{
		System.out.println("static method");
	}
	public void myMethod1()
	{
		System.out.println("normal method");
	}
	
	public static void main(String args[])
	{
		Test022  s = new Test022();
		
		s.myMethod1();
		s.myMethod();
		//myMethod();
		
	}


}

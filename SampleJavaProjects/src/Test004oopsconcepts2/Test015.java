package Test004oopsconcepts2;

public class Test015 {
	
	public static void staticMethod()

	{
		System.out.println("static method");
	}
	
	public void normalMethod()
	{
		System.out.println("normal method");
	}
	public static void main(String args[])
	{
		Test015.staticMethod();
		
		Test015 s = new Test015();
		
		s.normalMethod();
		
	}

}

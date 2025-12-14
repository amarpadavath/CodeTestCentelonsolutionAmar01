package Test003oopsconcepts;

public class Test100 {
	
	private int a;
	private int b;
	
	public void add()
	{
		System.out.println(a+b);
	}
	
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public static void main(String args[])
	
	{
		Test100 obj = new Test100();
		
		obj.a  =1;
		obj.b = 2;
		obj.add();
		obj.sub();
		
	}
	

}

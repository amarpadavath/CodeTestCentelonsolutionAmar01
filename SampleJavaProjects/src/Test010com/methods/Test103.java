package Test010com.methods;

public class Test103 {

	public static int i=0;
	
	Test103()
	{
		i++;
	}
	
	public static int get()
	{
		return i;
	}
	
	public int m1()
	{
		System.out.println("inside method m1");
		this.m2();
		return 1;
	}
	
	public void m2()
	{
		System.out.println("in method m2");
	}

}

package Test003oopsconcepts;

public class Test123 {
	
	int x = 10;
	
	public static void main(String args[])
	{
		Test123 s= new Test123();
		Test123 b= new Test123();
		
		b.x=30;
		
		System.out.println(s.x);
		
		System.out.println(b.x);
	}

}

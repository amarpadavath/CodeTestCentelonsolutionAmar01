package Test004oopsconcepts2;

public class Test016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test016 s = new Test016();
		s.fullThroattle();
		s.speed(20);
		
		System.out.println("max speed is"+s.speed1(10));
		
		
	}

	public void fullThroattle()

	{
		System.out.println("the car is going as fast as it can");
	}
	
	public void speed(int x)
	{
	
		System.out.println("max speed is" +x);
	}
	
	public int speed1(int x)
	{
		
	return x;
	}

}

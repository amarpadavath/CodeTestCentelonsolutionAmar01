package Test019Practice;


abstract class Animal1
{
	abstract void animalSound();
	
	public void sleep()
	{
		System.out.println("test");
	}
}

 class Pig1 extends Animal1
{

	@Override
	void animalSound() {
		// TODO Auto-generated method stub
		
		System.out.println("test");
		
	}
	
}

public class Test028 {
	
	public static void main(String args[])
	{
			
		Pig1 s = new Pig1();
		
		s.animalSound();
		s.sleep();
		
		
	}
	}

	



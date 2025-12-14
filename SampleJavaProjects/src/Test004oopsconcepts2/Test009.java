package Test004oopsconcepts2;

public class Test009 implements Test008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test009 s= new Test009();
		
		s.animalSound();
		s.sleep();
		

	}

	@Override
	public void animalSound() {
		// TODO Auto-generated method stub
		
		System.out.println("test");
		
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("test05");
	}

}

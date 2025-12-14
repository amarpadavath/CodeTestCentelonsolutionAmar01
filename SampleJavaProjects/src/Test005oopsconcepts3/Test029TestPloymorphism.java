package Test005oopsconcepts3;

public class Test029TestPloymorphism {
	
	public static void main(String args[]) {
		
		Test026Animal animal1 = new Test026Animal();
		
		animal1.sound();
		
		Test027Dog dog1 = new Test027Dog();
		
		dog1.sound();
		
		Test028Cat cat1 = new Test028Cat();
		
		cat1.sound();
		
		Test026Animal dog = new Test027Dog();
		
		dog.sound();
		
		Test026Animal cat = new Test028Cat();
		
		cat.sound();
	}

}

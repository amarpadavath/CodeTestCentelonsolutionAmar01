package Test005oopsconcepts3;

public class Test004Main {
	
	public static void main(String args[])
	{
		Test001InheritanceAnimal myDog = new Test002Dog();
		
		Test001InheritanceAnimal myCat = new Test003Cat();
		
		Test001InheritanceAnimal  s = new Test001InheritanceAnimal();
		
		s.makeSound();
		
		myDog.makeSound();
		
		myCat.makeSound();
		
	}

}

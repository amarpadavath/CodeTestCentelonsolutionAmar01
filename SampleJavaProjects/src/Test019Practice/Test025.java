package Test019Practice;

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

class Pig extends Animal {
	  public void animalSound() {
		  super.animalSound(); 
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
public class Test025 {
	
	public static void main(String args[])
	{
		Animal s = new Animal();
		s.animalSound();
		
		Animal b= new Dog();
		b.animalSound();
		
		Animal c = new Pig();
		c.animalSound();
	}

}

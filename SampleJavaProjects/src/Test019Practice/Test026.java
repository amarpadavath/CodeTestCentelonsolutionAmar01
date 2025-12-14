package Test019Practice;

public class Test026 {

	public static void main(String[] args) {
		Dog123 myDog = new Dog123();
		myDog.printType();
	}
}

class Animal123 {
	String type = "Animal";
}

class Dog123 extends Animal123 {
	String type = "Dog";

	public void printType() {
		System.out.println(super.type); // Access parent attribute
	}
}

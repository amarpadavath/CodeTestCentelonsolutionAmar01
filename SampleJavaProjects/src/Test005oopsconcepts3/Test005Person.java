package Test005oopsconcepts3;

public class Test005Person {
	
	String name;
	int age ;
	
	public Test005Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void displayInfo()
	{
		System.out.println(name);
		
		System.out.println(age);
	}

}

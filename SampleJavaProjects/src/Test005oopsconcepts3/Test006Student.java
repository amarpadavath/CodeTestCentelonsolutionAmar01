package Test005oopsconcepts3;

public class Test006Student extends Test005Person {
	
	String major;

	public Test006Student(String name, int age,String major) {
		super(name, age);
		// TODO Auto-generated constructor stub
		this.major=major;
		
	}
	
	public void displayMajor()
	{
		System.out.println("majpr"+major);
	}
	
	

}

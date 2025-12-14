package Test003oopsconcepts;

abstract public class Test120 {
	
	String color;
	abstract double area();
	
	public abstract String toString();
	
	public Test120(String color)
	{
		System.out.println("shape constructor called");
		
		this.color= color;
	}
	
	public String getColor()
	{
		return color;
	}
	

}

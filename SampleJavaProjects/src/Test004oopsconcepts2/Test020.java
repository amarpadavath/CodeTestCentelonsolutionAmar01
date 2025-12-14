package Test004oopsconcepts2;

public class Test020 {
	
	int modelyear;
	String modelName;
	
	public Test020(int modelyear, String  modelName)
	{
		this.modelName = modelName;
		this.modelyear = modelyear;
	}
	
	public static void main(String args[])
	{
		Test020 s = new Test020(2,"amar");
		
		System.out.println(s.modelName+" "+s.modelyear);
	}

}

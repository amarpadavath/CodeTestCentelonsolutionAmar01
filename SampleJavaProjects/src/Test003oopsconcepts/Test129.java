package Test003oopsconcepts;

public class Test129 {
	
	int modelYear;
	String modelName;
	
	public Test129(int modelYear,String modelName)
	{
		this.modelName = modelName;
		this.modelYear = modelYear;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test129 s = new Test129(1996, "amar");
		System.out.println(s.modelName);
		System.out.println(s.modelYear);
	}

}

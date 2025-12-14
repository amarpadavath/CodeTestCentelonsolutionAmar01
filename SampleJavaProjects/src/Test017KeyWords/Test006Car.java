package Test017KeyWords;

public class Test006Car extends Test006vehicle {
	
	private String modelName = "Mustag";
	
	public static void main(String args[])
	{
		Test006Car s = new Test006Car();
		
		s.honk();
		
		System.out.println(s.modelName+""+s.brand);
		
	}
	
	

}

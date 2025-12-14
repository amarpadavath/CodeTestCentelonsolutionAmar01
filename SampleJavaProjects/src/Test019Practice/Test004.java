package Test019Practice;

public class Test004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int weather = 2;
		
		if(weather==1)
		{
			System.out.println("test");
			
		}
		else if(weather==2)
		{
			System.out.println("test1");
		}
		else
			
		{
			System.out.println("test3");
		}
		
		//int time = 20;
	//	String result = (time < 18) ? "Good day." : "Good evening.";
	//	System.out.println(result);
		
		
		
		int time = 20;
		
		String result = (time>18)?"Good day":"good evng";
		
		System.out.println(result);
		
		int age = 20;
		boolean isCitizen = true;
		
		if(age>=18)
		{
			if(isCitizen)
			{
				System.out.println("eligible");
			}
			
			else
			{
				System.out.println("not senior citizen");
			}
		}
		else
		{
			System.out.println("not old enough to vote");
		}
		
		

	}

}

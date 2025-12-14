
public class Test15Method3 {
	
	public static void main(String args[])
	{
		Test14Method2 obj = new Test14Method2();
		
		int i = obj.m1();
		
		//System.out.println("control returned after method 1 :" +i);
		
		int no_of_obj = obj.get();
		
	    // Print statement
        System.out.print(
            "No of instances created till now : ");

        System.out.println(no_of_obj);
		
	}

}

package Test019Practice;

public class Test027 {
	
	public static void main(String args[])
	{
	
	OuterClass myOuter = new OuterClass();
	
	OuterClass myOuter1 = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    
    OuterClass.InnerClass myInner1 = myOuter1.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
    System.out.println(myInner1.y + myOuter1.x);
}
}
	

	
	class OuterClass
	{
		int x =10;
		
		
		class InnerClass
		{
			int y =5;
		}
	}



package Test017KeyWords;

public class Test013a {
	
	static void myStaticMethod()
	{
		 System.out.println("Static methods can be called without creating objects");
	}
	
	 // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }
	  
	  public static void main(String args[])
	  {
		  myStaticMethod();
		  
		  Test013a s = new Test013a();
		  
		  s.myPublicMethod();
	  }


}

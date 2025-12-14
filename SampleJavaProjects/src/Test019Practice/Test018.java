package Test019Practice;

public class Test018 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myStaticMethod();
		
		Test018 s  = new Test018();
		s.myPublicMethod();

	}
	
	static void myStaticMethod() {
	    System.out.println("Static methods can be called without creating objects");
	  }

	  // Public method
	  public void myPublicMethod() {
	    System.out.println("Public methods must be called by creating objects");
	  }

}

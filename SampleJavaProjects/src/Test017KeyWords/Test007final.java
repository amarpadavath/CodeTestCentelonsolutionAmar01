package Test017KeyWords;

public class Test007final {

	 final int x = 10;
	 
	 // final int x = 10;

	  public static void main(String[] args) {
		  Test007final myObj = new Test007final();
	    myObj.x = 25; // will generate an error: cannot assign a value to a final variable
	    System.out.println(myObj.x);
	  }

}

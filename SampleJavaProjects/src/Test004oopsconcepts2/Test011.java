package Test004oopsconcepts2;

enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}

public class Test011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Level myVar = Level.MEDIUM;

	    switch(myVar) {
	      case LOW:
	        System.out.println("Low level");
	        break;
	      case MEDIUM:
	         System.out.println("Medium level");
	        break;
	      case HIGH:
	        System.out.println("High level");
	        break;

	}
	    
	    for (Level myVar1 : Level.values()) {
	    	  System.out.println(myVar1);
	    	}
	}
}



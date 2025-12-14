package Test019Practice;

public class Test033 {
	
	enum Level
	{
		LOW,
		Medium,
		High
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Level myVar = Level.Medium; 
	    System.out.println(myVar);
	    
	    switch(myVar)
	    {
	    
	    case LOW:
	    	
	    	System.out.println("low");
	    	
	    	break;
	    	
	    case High:
	    	
	    	System.out.println("High");
	    	
	    	break;
	    	
	    case Medium:
	    	System.out.println("medium");
	    	
	    	break;
	    	
	    
	    
	    }

	}

}

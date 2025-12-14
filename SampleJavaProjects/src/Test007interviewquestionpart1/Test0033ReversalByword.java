package Test007interviewquestionpart1;

public class Test0033ReversalByword {
	
	public static void main(String args[])
	{
		 String sentence = "I would like to reverse word by word for sentence";
		 
		 String words[] = sentence.split("");
		 
	     
	      int c = words.length;
	      
	      String rev = "";
	      
	      for(int i=c-1;i>=0;i--)
	      {
	    	  rev= rev + words[i];
	      }
	      
	      System.out.println(rev);
	      System.out.println("Can i normal");
	}

}

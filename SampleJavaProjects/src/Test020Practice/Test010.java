package Test020Practice;

public class Test010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  s = "done amar pv"  ;

		String revS = " ";

		String[] word=s.split(" ");
		 
		 for(int i = 0;i<=word.length-1;i++)
		 {
		 
		 String w =word[i];
		 
		 String revW="";
		 
		 for(int j=w.length()-1;j>=0;j--)
		 {
		 
		 revW= revW + w.charAt(j);
		 }
		 
		 revS= revS+revW+" ";
		 
		 
		 
		 }
		 
		 System.out.println(revS);
		 
		 


		}


	}


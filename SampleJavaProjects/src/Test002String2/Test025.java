package Test002String2;

public class Test025 {
	
	public static void main(String args[])
	{
		String myStr = "Split a string by spaces, and also punctuation.";
		String regex = "[,\\.\\s]";
		String[] myArray = myStr.split(regex);
		for (String s : myArray) {
		  System.out.println(s);
		}
		
		String s = "spiy , ama. ";
		
		String b = "[,\\.\\s]";
		
		String[] myArray1 = s.split(b);
		
		for(String g : myArray1)
		{
			System.out.println(g);
		}
		
		
		
	}

}

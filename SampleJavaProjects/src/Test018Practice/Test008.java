package Test018Practice;

public class Test008 {
	
	public static void main(String args[])
	{
		
		String s = "I am amar";
		
		String[] word = s.split(" ");
		
		String revString="";
		
		for(int i = word.length-1;i>=0;i--)
		{
			String words= word[i];
			
			String revWord="";
			
			for(int j=words.length()-1;j>=0;j--)
			{
				revWord= revWord + words.charAt(j);
			}
			
			revString = revString+ revWord+" ";
			
		}
		
		System.out.println(revString);
		
		
	}

}

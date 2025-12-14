package Test007interviewquestionpart1;

public class Test0012Reversalofwordsbywords {


	public static void main(String arg[])
	{
		
		String sentence = "I cam do";
		
		String[] words = sentence.split("");
		
	String 	reversed ="";
		
		for(int i=words.length;i>=0;i--)
		{
			reversed = reversed + words[i]+" ";
		}
		
		System.out.print(reversed.trim());
	}

}

package Test018Practice;

public class Test031 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String  s = "done amar pv"  ; //vp
		
		String revSentence = " ";
		
		String word[] = s.split(" ");
		
		for(int i = 0;i<word.length;i++)
		{
			String w = word[i];
			String revWord="";
			
			for(int j=w.length()-1;j>=0;j-- )
			{
				
				revWord = revWord + w.charAt(j);
			}
			
			revSentence = revSentence + revWord +  " ";
		}
		
		System.out.println(revSentence.trim());


	}

}

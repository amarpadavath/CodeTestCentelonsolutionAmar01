package Test018Practice;

public class Test029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s = "amar pv done";
		
		String word[] = s.split(" ");
		
		String rev = "";
		
		for(int i = word.length-1;i>=0;i--)
		{
			
			rev = rev + word[i]+" ";
			
			
		}
		
		System.out.println(rev.trim());
		

	}

}

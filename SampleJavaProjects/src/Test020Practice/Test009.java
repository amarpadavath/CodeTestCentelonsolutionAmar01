package Test020Practice;

public class Test009 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "I amar amar";

		String[] word= s.split(" ");

		String rev = "";

		for(int i = word.length-1;i>=0;i--)
		{

		rev = rev + word[i]+" ";
		}

		System.out.println(rev.trim());
	}

}

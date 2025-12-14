package Test018Practice;

public class Test028 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String s = " I am amar";
		
		int x = s.length();
		
		String rev = "";
		
		for(int i=x-1;i>0;i--)
		{
			char ch = s.charAt(i);
			
			rev = rev + ch;
			
		}
		System.out.println(rev);

	}

}

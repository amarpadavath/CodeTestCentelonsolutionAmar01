package Test020Practice;

public class Test012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "xfgcvbcvbddfbcrtgbaeiou";
		int count=0;
		
		for(int i=0;i<s.length();i++)
		{
		
		char ch = s.charAt(i);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o')
		{
			count++;
		}
		
		
		
		
			
		}
		System.out.println(count);

	}

}

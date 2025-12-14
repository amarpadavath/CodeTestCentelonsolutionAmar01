package Test002String2;

public class Test002Chatat {
	
	public static void main(String args[])
	{
		String s ="Hellow";
		char result = s.charAt(0);
		int w = s.codePointAt(0);
		System.out.println(result);
		System.out.println(w);
		System.out.println(s.codePointBefore(1));
		System.out.println(s.codePointCount(1, 3));
	}

}

package Test002String2;

public class Test011 {
	
	public static void main(String args[])
	{
		char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(arr);
		String s = "Hellow world";
		s.getChars(7, 12, arr, 4);
		System.out.println(s);
	}

}

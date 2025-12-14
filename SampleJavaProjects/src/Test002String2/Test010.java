package Test002String2;

public class Test010 {

	public static void main(String args[])
	{
		String myStr = "Hello %s! One kilobyte is %,d bytes.";
		String result = String.format(myStr, "World", 1024);
		System.out.println(result);
		
		String myStr1 = "Hello";
		byte[] result1 = myStr.getBytes();
		System.out.println(result1[0]);
	}
}

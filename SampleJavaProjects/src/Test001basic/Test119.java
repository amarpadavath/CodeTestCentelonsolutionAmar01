package Test001basic;

public class Test119 {
	
	public static void main(String args[])
	
	{
		try
		{
		int[] arrr = {10,20,30};
		
		System.out.println(arrr[7]);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("Alwas");
		}
		
	}

}

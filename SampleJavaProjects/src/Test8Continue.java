import java.util.Scanner;

public class Test8Continue {
	
	public static void main(String arg[])

	{
		Scanner s = new Scanner(System.in);
		
		int f=s.nextInt();
		for(int i =0; i<=f;i++)
		{
			
			if(i==3)
				continue;
			System.out.println("no is " + i);
		}
		
	}
}

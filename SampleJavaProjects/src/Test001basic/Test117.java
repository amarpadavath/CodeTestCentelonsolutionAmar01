package Test001basic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test117 {
	
	public static void main(String args[]) throws FileNotFoundException
	{
		try
		{
			FileReader fr = new FileReader("res.txt");
		}
		catch(IOException e)
		{
			  System.out.println("File not found: " + e.getMessage());
		}
		
		FileReader fr1 = new FileReader("resa.txt");
	}

}

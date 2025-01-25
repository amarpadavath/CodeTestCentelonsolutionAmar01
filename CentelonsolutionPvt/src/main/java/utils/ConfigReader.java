package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	
private static  Properties properties= new Properties();
	
	static 
	{
		try
		{
			FileInputStream inputStream = new FileInputStream("src/test/resources/config.properties");
			
			properties.load(inputStream);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
	}

	public static  String getProperty(String key) {
		// TODO Auto-generated method stub
		return properties.getProperty(key);
	}
}

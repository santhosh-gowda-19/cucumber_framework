package TY.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Fetch_Properties 
{
	public static String getProperties_value() throws IOException
	{
		FileInputStream fis=new FileInputStream("./src/test/java/TY/Utils/GlobalProperties.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String a1 = pro.getProperty("baseURI");
		return a1;
		
	}

	

}

package util;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadPropertyFile {

	
	public  String read(String Key)throws Exception{  
	   
		
		
		Properties prop = new Properties();
		InputStream input = null;

		try {

			String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\TestData\\FedEx.properties";
			input = new FileInputStream(filePath);

			// load a properties file
			prop.load(input);

			// get the property value and print it out
			
			

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return prop.getProperty(Key);

	}
}

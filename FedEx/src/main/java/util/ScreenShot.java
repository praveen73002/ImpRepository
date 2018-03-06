package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {

private   String fileSeperator = System.getProperty("file.separator");

	public   void takeScreenShot(WebDriver driver, String testMethodName,String testClassName,String filepath) {
	
	 
		System.out.println("Captureeeeeeeeeeeeeee");
		
		System.out.println(System.getProperty("file.separator"));
		File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try{
			
			//FileUtils.copyFile(srcFile,new File("F:"+fileSeperator+"ScreenShots"+fileSeperator+testClassName+fileSeperator+testMethodName+".png"));
			FileUtils.copyFile(srcFile,new File(filepath+fileSeperator+testClassName+fileSeperator+testMethodName+".png"));
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

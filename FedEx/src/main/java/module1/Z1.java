package module1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Z1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver	driver=new FirefoxDriver();
		driver.get("https://www.google.co.in/");
		
		

		File f=((TakesScreenshot )driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("E:\\bb.pdf"));
	}

}

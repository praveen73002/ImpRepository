package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GridTest {
  @Test
  public void f() throws MalformedURLException {
	  
	  
	  DesiredCapabilities cap=DesiredCapabilities.firefox();
	  cap.setPlatform(Platform.WIN10);
	  
	  URL url=new URL("http://localhost:4444/wd/hub");			  
			 
	  WebDriver driver=new RemoteWebDriver(url,cap);
	  
	  driver.get("http://learn-automation.com");
	  driver.quit();
  }
}

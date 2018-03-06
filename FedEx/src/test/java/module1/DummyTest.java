package module1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class DummyTest {
  @Test
  public void f() throws MalformedURLException {
	 // DesiredCapabilites is used to set the type of browser and OS that we will automate
	  DesiredCapabilities cap=DesiredCapabilities.firefox();
	  cap.setPlatform(Platform.WIN10);
	  cap.setBrowserName("firefox");
	  //Here we have to give Node(where you want to execute your TestScript) Url but if we give...
	  //  ...Hub url Hub will take care on which Node it should execute Test Script
	 URL url=new URL("http://localhost:4444/wd/hub");
	 
	 //RemoteWebDriver is used to set which node (or machine) that our test will run against.

	 WebDriver driver = new RemoteWebDriver(url, cap);
	  driver.get("http://learn-automation.com");
	  
	  driver.quit();
  }
}

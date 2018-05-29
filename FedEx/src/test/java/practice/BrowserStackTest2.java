package practice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStackTest2 {
  @Test
  public void f() throws MalformedURLException {
	  
	    final String USERNAME = "praveen549";
	    final String AUTOMATE_KEY = "eu6J23Xm1gAshkgofmCn";
	    final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	  
	  DesiredCapabilities caps =  DesiredCapabilities.firefox();
	 caps.setPlatform(Platform.WIN8);
	  
	    
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("samsung");
	    element.submit();

	    System.out.println(driver.getTitle());
	    driver.quit();
  }
}

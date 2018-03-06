package module1;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserStackest {
  @Test
  public void f() throws MalformedURLException {
	  
	  final String USERNAME = "praveen543";
	  final String AUTOMATE_KEY = "R7nyEgp66J39DXqAzoKz";
	  final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

	    DesiredCapabilities cap = DesiredCapabilities.firefox();
	    cap.setPlatform(Platform.XP);
	    

	    WebDriver driver = new RemoteWebDriver(new URL(URL), cap);
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));

	    element.sendKeys("BrowserStack");
	    element.submit();
	    System.out.println(driver.getTitle());
	    driver.quit();
  }
  
}

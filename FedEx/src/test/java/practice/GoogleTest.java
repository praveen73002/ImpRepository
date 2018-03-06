package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pagefactorymodule.Google;

public class GoogleTest {
  @Test
  public void f() {
	  
WebDriver driver=new FirefoxDriver();
driver.get("http://google.com");
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
Google gobj=new Google(driver);
gobj.serach();

  }
}

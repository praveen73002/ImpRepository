package module1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriveMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "E:\\SW-Java-Selenium-TestNG\\chromedriver_win32\\chromedriver.exe");
		driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.get("https://www.fedex.com/en-us/home.html");
		  driver.manage().window().maximize();
		  driver.findElement(By.xpath("html/body/header/div/div/nav/div/ul/div[1]/li/a")).click();
		  driver.findElement(By.xpath("html/body/header/div/div/nav/div/ul/div[1]/li/div/div[1]/a")).click();
		  Login lgn=new Login(driver);
		  lgn.loginToFedEx("praveen90613", "Zxcvbnm*123");
		 
		  
		  }

}

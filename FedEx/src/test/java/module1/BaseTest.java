package module1;

import org.testng.annotations.Test;

import util.RWExel;
import util.ReadPropertyFile;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.MarionetteDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseTest {
  WebDriver driver;
  
  
   public WebDriver getDriver()
 {
	  return driver;
  }
  @BeforeMethod
  @Parameters("browser")
  public void setUp(String browser) {
	  
	  
	  if(browser.equalsIgnoreCase("Firefox"))
	  {
		//System.setProperty("webdriver.gecko.driver", "E:\\SW-Java-Selenium-TestNG\\geckodriver-v0.14.0-win64\\geckodriver.exe");
		//driver=new FirefoxDriver();
		  
		  driver=new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		  driver.manage().window().maximize();

		  try {
			  
			  driver.get(new ReadPropertyFile().read("url"));
			  Home objHome=new Home(driver);
			  objHome.navgatetoLogin();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
			

	  }
	  else if(browser.equalsIgnoreCase ("Chrome"))
	  {
		System.setProperty("webdriver.chrome.driver", "E:\\SW-Java-Selenium-TestNG\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


	  }
	  
  }
  
  @AfterMethod
  public void afterTest() {
	  
	  if (driver != null){
	        try{
	            driver.quit();
	        }
	        catch (WebDriverException e) {
	            System.out.println("***** CAUGHT EXCEPTION IN DRIVER TEARDOWN *****");
	            System.out.println(e);
	        }
	    }}
  

  @DataProvider
  public Object[][] dp(Method m) {
	  RWExel obj=new RWExel();
		String[][] arrayExcelData;
		
		System.out.println(m.getName().toString());
		System.out.println(this.getClass().getSimpleName());
		System.out.println(m.getName().getClass().getSimpleName());
		String filePath = System.getProperty("user.dir")+"\\src\\main\\resources\\TestData";
		//arrayExcelData=obj.getExcelData(filePath, "login.xlsx", "Sheet1");
		arrayExcelData=obj.getExcelData(filePath,this.getClass().getSimpleName()+".xlsx",m.getName().toString());
 return arrayExcelData;
    
  }
}

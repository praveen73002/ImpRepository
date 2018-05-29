package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {

	WebDriver driver;
	By shippingbtn=By.xpath("html/body/header/div/div/nav/div/ul/div[1]/li/a");
	By  create_shippingbtn=By.xpath("html/body/header/div/div/nav/div/ul/div[1]/li/div/div[1]/a");
	
	Home(WebDriver d)
	{
		driver=d;
		////////////ghghfghjhgjhg
	}
	
	public void navgatetoLogin()
	{
	driver.findElement(shippingbtn).click();
	  driver.findElement(create_shippingbtn).click();
	  

	}
}

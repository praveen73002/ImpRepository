package pagefactorymodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageFactory {
	
	
	
	WebDriver driver;
	
	@FindBy(xpath="html/body/header/div/div/nav/div/ul/div[1]/li/a")
	WebElement shippingbtn;
	
	@FindBy(xpath="html/body/header/div/div/nav/div/ul/div[1]/li/div/div[1]/a")
	WebElement  create_shippingbtn;
	
	HomePageFactory(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
		
	}

	public void navgatetoLogin()
	{
	shippingbtn.click();
	create_shippingbtn.click();
	  

	}

}

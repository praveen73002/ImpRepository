package pagefactorymodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Google {
	
WebDriver driver;
	
	@FindBy(xpath="html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/div/input[3]")
	WebElement serchbox;
	
	public Google(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(driver, this);
		
	}

	public void serach(){
		serchbox.sendKeys("praveen");
		serchbox.clear();
		serchbox.sendKeys("reddy");
	}
}

package pagefactorymodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	
WebDriver driver;
	
   @FindBy(xpath="//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/input")
	WebElement username;
    
    @FindBy(xpath="//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input")
	WebElement pswd;
    
	@FindBy(xpath="//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/input")
    WebElement loginto;
	
	@FindBy(xpath="//*[@id='module.logon._expanded']/table/tbody/tr[6]/td/table/tbody/tr/td[3]/input")
	WebElement login_btn;
	
	@FindBy(xpath="//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr/td/b")
	WebElement err;
	
	
	public LoginPageFactory(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}

	public void setUsername(String struser)
	{
		username.sendKeys(struser);
	}
	
public void setPswd(String spswd){
		
		pswd.sendKeys(spswd);
		
		

	}

public void click_loginto_checkbox(){
	loginto.click();
}
public void clickLogin(){
	login_btn.click();
}
public void loginToFedEx(String struser,String spswd){
	this.setUsername(struser);;
	this.setPswd(spswd);
	this.click_loginto_checkbox();
	this.clickLogin();
}

public String getErr()
{
	return err.getText();
}
	
}

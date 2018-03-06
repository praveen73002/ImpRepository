 package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Login {

WebDriver driver;
	
	By username=By.xpath("//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/input");
	By pswd=By.xpath("//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[3]/td[2]/input");
	By loginto=By.xpath("//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr[5]/td[2]/input");
	By login_btn=By.xpath("//*[@id='module.logon._expanded']/table/tbody/tr[6]/td/table/tbody/tr/td[3]/input");
	By err=By.className("//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr/td/b");
	
	
	public Login(WebDriver d){
		driver=d;
	}

	
		public void setUsername(String struser)
	{
		driver.findElement(username).sendKeys(struser);
	}
	
public void setPswd(String spswd){
		
		driver.findElement(pswd).sendKeys(spswd);
		
		

	}

public void click_loginto_checkbox(){
	driver.findElement(loginto).click();
}
public void clickLogin(){
	driver.findElement(login_btn).click();
}
public void loginToFedEx(String struser,String spswd){
	this.setUsername(struser);;
	this.setPswd(spswd);
	this.click_loginto_checkbox();
	this.clickLogin();
}

public String getErr()
{
	return driver.findElement(err).getText();
}
}

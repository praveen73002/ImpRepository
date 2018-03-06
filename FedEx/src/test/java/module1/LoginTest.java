package module1;

import org.testng.annotations.Test;

import pagefactorymodule.LoginPageFactory;
import util.RWExel;

import org.testng.annotations.Test;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class LoginTest extends BaseTest {
	
	WebDriver driver;
LoginPageFactory objLogin;
//Login objLogin;
// @Test(dataProvider = "dp")
// public void login_to_FedEx(String username, String pswd,String errmsgfromXl) {
//	  String actualStr;
//	  driver=super.getDriver();
//	  objLogin=new Login(driver);	  
//	  objLogin.loginToFedEx(username,pswd);
//	 // Assert.assertEquals("The email address that you've entered doesn't match any account.",errmsgfromXl);
//	 
//	  	  
//	  if(driver.findElements(By.xpath("//*[@id='fx-lgLink']")).size() != 0){
//		 actualStr= driver.findElement(By.xpath("//*[@id='fx-lgLink']")).getText();
//		 
//		  System.out.println(actualStr);
//
//		
//		  }else{
//		  
//		  actualStr= driver.findElement(By.xpath("//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr/td/b[@class=error]")).getText();
//		  System.out.println(actualStr);
//
//		  }
//	  Assert.assertEquals(actualStr,errmsgfromXl);
//	  
//  }

  @Test(dataProvider = "dp")
  public void login_to_FedEx(String username, String pswd,String errmsgfromXl) {
	  String actualStr;
	  driver=super.getDriver();
	  objLogin=new LoginPageFactory(driver);	  
	  objLogin.loginToFedEx(username,pswd);
	 // Assert.assertEquals("The email address that you've entered doesn't match any account.",errmsgfromXl);
	 
	  	  
	  if(driver.findElements(By.xpath("//*[@id='fx-lgLink']")).size() != 0){
		 actualStr= driver.findElement(By.xpath("//*[@id='fx-lgLink']")).getText();
		 
		  System.out.println(actualStr);

		
		  }else{
		  
		  actualStr= driver.findElement(By.xpath("//*[@id='module.logon._expanded']/table/tbody/tr[4]/td/table/tbody/tr/td/b[@class=error]")).getText();
		  System.out.println(actualStr);

		  }
	  Assert.assertEquals(actualStr,errmsgfromXl);
	  
  }

}

package module1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ShipManagerLiteTest extends BaseTest {
	
	WebDriver driver;
	ShipManagerLite objshipmanagerlite;
	Login objLogin;
	
	
		  
		  
@Test(dataProvider = "dp")
  public void addressInformationTest(String fname,String fco,String fcountry,String faddress1,String faddress2,String pcode,String fcity,String fstate,String fphone,String fphoneext,String fen,String tname,String tco,String tcountry,String taddress1,String taddress2,String tzip,String tcity,String tstate,String tphone,String tpext,String ten) {
	
	//Properties prop=new
	driver=super.getDriver();
	objshipmanagerlite=new ShipManagerLite(driver);
	objLogin=new Login(driver);	  

	  objLogin.loginToFedEx("praveen90613","Zxcvbnm*123");
	
	objshipmanagerlite.filladdressInformation(fname, fco, fcountry, faddress1, faddress2, pcode, fcity, fstate, fphone, fphoneext, fen, tname, tco, tcountry, taddress1, taddress2, tzip, tcity, tstate, tphone, tpext, ten);
    objshipmanagerlite.click_addressbtn(); 
}
}

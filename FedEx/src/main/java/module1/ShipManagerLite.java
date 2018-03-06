package module1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.sun.jna.platform.mac.MacFileUtils.FileManager.FSRef;

public class ShipManagerLite {
	
WebDriver driver;
	
	By from_name=By.xpath("//input[@id='fx-from-name']");By from_company=By.xpath("//input[@id='fx-from-co']");
	
	By from_country=By.xpath("//input[@id='fx-from-country']");	By from_address1=By.xpath("//input[@id='fx-from-addr1']");By from_address2=By.xpath("//input[@id='fx-from-addr2']");
	By from_city=By.xpath("//input[@id='fx-from-city']");By from_pcode=By.xpath("//input[@id='fx-from-zip']");
	By from_phone=By.xpath("//input[@id='fx-from-phone']");By from_phone_ext=By.xpath("//input[@id='fx-from-phone-ext']");
	By from_email_notifications=By.xpath("//input[@id='fx-from-email']");By from_state=By.xpath("//input[@id='fx-from-federal-state']");
	
	
	By to_name=By.xpath("//input[@id='fx-to-name']");	By to_company=By.xpath("//input[@id='fx-to-co']");
	
	By to_country=By.xpath("//input[@id='fx-to-country']");	By to_address1=By.xpath("//input[@id='fx-to-addr1']");By to_address2=By.xpath("//input[@id='fx-to-addr2']");
	By to_zip=By.xpath("//input[@id='fx-to-zip']"); By to_city=By.xpath("//input[@id='fx-to-city']");   By to_state=By.xpath("//input[@id='fx-to-state']");
	By to_phone=By.xpath("//input[@id='fx-to-phone']");By to_phone_ext=By.xpath("//input[@id='fx-to-phone-ext']");
	By to_email_notifications=By.xpath("//input[@id='fx-to-email']");	By to_taxId=By.xpath("//input[@id='fx-to-state']");
	
	
	By addressbtn=By.xpath(".//*[@id='fx-address-button']");
		
	
	public void click_addressbtn()
	{
		driver.findElement(addressbtn).click();
	}
	
	public ShipManagerLite(WebDriver d) {
		
		driver=d;
		// TODO Auto-generated constructor stub
	}
	
	public void fillFromDetails(String fname,String fco,String fcountry,String faddress1,String faddress2,String pcode,String fcity,String fstate,String fphone,String fphoneext,String fen)
	{
		driver.findElement(from_name).sendKeys(fname);	driver.findElement(from_company).sendKeys(fco);
		driver.findElement(from_country).sendKeys(fcountry);driver.findElement(from_address1).sendKeys(faddress1);
		driver.findElement(from_address2).sendKeys(faddress2);driver.findElement(from_pcode).sendKeys(pcode);
		driver.findElement(from_city).sendKeys(fcity);driver.findElement(from_phone).sendKeys(fphone);driver.findElement(from_phone_ext).sendKeys(fphoneext);
		driver.findElement(from_email_notifications).sendKeys(fen);driver.findElement(from_state).sendKeys(fstate);

	
	}
	
	public void fillToDetails(String tname,String tco,String tcountry,String taddress1,String taddress2,String tzip,String tcity,String tstate,String tphone,String tpext,String ten)
	{
		driver.findElement(to_name).sendKeys(tname);	driver.findElement(to_company).sendKeys(tco);
		driver.findElement(to_country).sendKeys(tcountry);driver.findElement(to_address1).sendKeys(taddress1);driver.findElement(to_address2).sendKeys(taddress2);
		driver.findElement(to_zip).sendKeys(tzip);driver.findElement(to_city).sendKeys(tcity);driver.findElement(to_state).sendKeys(tstate);
		driver.findElement(to_phone).sendKeys(tphone);driver.findElement(to_phone_ext).sendKeys(tpext);

		driver.findElement(to_email_notifications).sendKeys(ten);

	
	}

	public void filladdressInformation(String fname,String fco,String fcountry,String faddress1,String faddress2,String pcode,String fcity,String fstate,String fphone,String fphoneext,String fen,String tname,String tco,String tcountry,String taddress1,String taddress2,String tzip,String tcity,String tstate,String tphone,String tpext,String ten){
		
		this.fillFromDetails(fname, fco, fcountry, faddress1, faddress2, pcode, fcity, fstate, fphone, fphoneext, fen);		
		this.fillToDetails(tname, tco, tcountry, taddress1, taddress2, tzip, tcity, tstate, tphone, tpext, ten);
		this.click_addressbtn();
	}
}

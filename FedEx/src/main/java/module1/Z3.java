package module1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Z3 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		Z3 obj=new Z3();
		//obj.workingWithFrames(driver);
		
		
		obj.workingwithRoboClass(driver);

	}

	//Working with multiple Frames
	public void workingWithFrames(WebDriver driver)
	{
		driver.get("http://demo.guru99.com/test/guru99home/");
		List<WebElement> fr=driver.findElements(By.tagName("iframe"));
		System.out.println(fr.size());
		System.out.println(fr.get(1).getTagName());

		driver.switchTo().frame(0);
		System.out.println(driver.findElements(By.tagName("a")).size());
		driver.switchTo().defaultContent();
		for(int i=0;i<driver.findElements(By.tagName("a")).size();i++)
		System.out.println(driver.findElements(By.tagName("a")).get(i).getLocation());
        driver.quit();
		}
	
	public void workingwithRoboClass(WebDriver driver) throws AWTException, InterruptedException{
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
        driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	
        Robot robot = new Robot();  // Robot class throws AWT Exception	
        Thread.sleep(2000); // Thread.sleep throws InterruptedException	
        robot.keyPress(KeyEvent.VK_DOWN);  // press arrow down key of keyboard to navigate and select Save radio button	
        
        Thread.sleep(2000);  // sleep has only been used to showcase each event separately	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(2000);	
        robot.keyPress(KeyEvent.VK_ENTER);	
    // press enter key of keyboard to perform above selected action
	}
}

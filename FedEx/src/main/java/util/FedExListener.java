package util;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import module1.BaseTest;;

public class FedExListener extends TestListenerAdapter {
	
	
	public void onTestSuccess(ITestResult result) {
		
		Object currentClass = result.getInstance();
	    WebDriver driver = ((BaseTest) currentClass).getDriver();

		
		String testMethodName = result.getName().toString().trim();

		String tesClassName=result.getInstanceName().trim();
		
		String[] reqTestClassName=tesClassName.split("\\.");
		int i=reqTestClassName.length-1;
		
//		Object obj=result.getInstance();
//		System.out.println(testMethodName);
//		System.out.println(reqTestClassName[i]);
//		System.out.println(System.getProperty("file.separator"));
//		System.out.println(obj);
//		System.out.println(driver.hashCode());
		
		String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShots\\Succeess_ScreenShots";

		new ScreenShot().takeScreenShot(driver,testMethodName,reqTestClassName[i],filepath);
	}
	public void onTestFailure(ITestResult result){
		
	    Object currentClass = result.getInstance();
	    WebDriver driver = ((BaseTest) currentClass).getDriver();

		
		String testMethodName = result.getName().toString().trim();

		String tesClassName=result.getInstanceName().trim();
		
		String[] reqTestClassName=tesClassName.split("\\.");
		int i=reqTestClassName.length-1;
		
//		Object obj=result.getInstance();
//		System.out.println(testMethodName);
//		System.out.println(reqTestClassName[i]);
//		System.out.println(System.getProperty("file.separator"));
//		System.out.println(obj);
//		System.out.println(driver.hashCode());
		
		String filepath = System.getProperty("user.dir")+"\\src\\test\\resources\\ScreenShots\\Failed_ScreenShots";
		new	ScreenShot().takeScreenShot(driver,testMethodName,reqTestClassName[i],filepath);
		

	}
		

}

package SalesForceTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass extends ReadProperties{
	
	public static WebDriver driver=null ;
	public static void getDriver(String browser) {
		

	switch(browser){
	case "firefox":
		System.setProperty("webdriver.gecko.driver","C:\\Users\\likit\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        break;
	case "chrome":
     	System.setProperty("webdriver.chrome.driver","C:\\Users\\likit\\Downloads\\chromedriver_win32\\chromedriver.exe");
       driver = new ChromeDriver();
       default: break;
	}
	}
	
	public static void enterText(WebElement element,String text,String objName) {
		if (element.isDisplayed()) {
			clearElement(element,objName);
			element.sendKeys(text);
       	 System.out.println("Text enterted in "+objName+" field");
   	 }
   	 else {
   		 System.out.println("Fail:"+objName+" element not displayed");
   	 }
	}
	public static void clearElement(WebElement element,String objName) {
		if (element.isDisplayed()) {
			element.clear();
			System.out.println("Pass:"+objName+" element cleared");
		}
		else {
			System.out.println("Fail:"+objName+" element not cleared");
		}
	}
	public static void ClickButton(WebElement element,String objName) {
		if (element.isDisplayed()) {
			element.click();
       	 System.out.println("Click-pass: "+objName+" field");
   	 }
   	 else {
   		 System.out.println("Click-Fail:"+objName+" element not displayed");
   	 }
	}
	
	public static void waitElement(WebElement element,String objName) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
   	    wait.until(ExpectedConditions.visibilityOf(element));
   	    System.out.println("Wait element for :"+objName);
	}
}

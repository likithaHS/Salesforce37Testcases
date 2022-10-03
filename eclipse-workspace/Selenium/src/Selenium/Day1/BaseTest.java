package Selenium.Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
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
		
	}



package com.firebase.test.base;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.Properties;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.firebase.test.pages.home.HomePage;
import com.firebase.test.pages.login.LoginPage;
import com.firebase.test.utility.CommonUtilities;
import com.firebase.test.utility.GenerateReports;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	public static Logger logger= LogManager.getLogger(BaseTest.class);
	public static GenerateReports report=null;

	public static void getDriver(String browser) {

		switch (browser) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "chrome":
			// System.setProperty("webdriver.chrome.driver","C:\\Users\\likit\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		default:
			break;
		}
	}
	@BeforeTest
	public static void setupBeforeTest() {
		report=GenerateReports.getInstance();
		report.startExtentReports();
	}
	@Parameters({"browserName"})
    @BeforeMethod
	public static void setUp(String browserName,Method m) {
    	//logger.info("Before Method Start execution");
    	report.startSingleTestReport(m.getName());
    	report.logTestInfo("Before Method Start execution");
    	CommonUtilities cu = new CommonUtilities();
    	Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String url =cu.getApplicationProperty("url", applicationPropertiesFile);
		getDriver(browserName);
		WaitDriver();
		driver.get(url);
		driver.manage().window().maximize();
		sleep(1);
	}
    @AfterMethod
    public static void tearDown() {
    	//logger.info("After method start execution");
    	report.logTestInfo("After method start execution");
    	sleep(3);
    	driver.close();
    }
    @AfterTest
    public static void teardownAfterTest() {
    	report.endReport();
    }
    public static void defineWait() {
    wait = new WebDriverWait(driver, Duration.ofSeconds(100));
    }
    
   
    

	public static void WaitDriver() {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(200));
	}
	
	
	
	/**
	 * @param sleepMs
	 */
	public static void sleep(int sleepSec) {
		try {
			Thread.sleep(sleepSec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	
}

package SalesForceTesting;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstScript extends FirstClass{
	
	/* public static void AutomationScript(String browser) {
	    	//System.setProperty("webdriver.chrome.driver","C:\\Users\\likit\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        //WebDriver driver = new ChromeDriver();
	    	getDriver(browser);
	        driver.get("https://www.google.com/");
	        String url =driver.getCurrentUrl();
	        System.out.println("url: "+url);
	        String title = driver.getTitle();
	        System.out.println("Title: "+title);
	        driver.manage().window().maximize();
	        WebElement searchElement= driver.findElement(By.name("q"));
	        searchElement.clear();
	        searchElement.sendKeys("Selenium"+Keys.ENTER);
	        driver.close();*/
	        
	        
	        public static void errorMessage01(String browser) throws InterruptedException, IOException {
	        	System.out.println("test case-errorMessage01");
	        	getDriver(browser);
	        	 driver.get(readPropertyData("url"));
	        	 driver.manage().window().maximize();
	        	 Thread.sleep(8000);
	        	 WebElement username = driver.findElement(By.id("username"));
	        	 //WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	        	 //wait.until(ExpectedConditions.visibilityOf(username));
	        	 waitElement(username,"username");
	        	 enterText(username,readPropertyData("vaild_username"),"vaild-uname");
	           	 WebElement password = driver.findElement(By.id("password"));
	           	 waitElement(password,"password");
	           	 clearElement(password,"vaild-password");
	        	 WebElement loginbutton = driver.findElement(By.id("Login"));
	        	 waitElement(loginbutton,"loginbutton");
	        	 ClickButton(loginbutton,"login-button");
	           	 Thread.sleep(5000);
	        	 driver.close();
	     
	        }
	        
	        public static void loginSalesForce2(String browser) throws InterruptedException, IOException {
	        	System.out.println("Testcase-loginSalesForce2");
	        	getDriver(browser);
	        	 driver.get("https://login.salesforce.com/");
	        	 driver.manage().window().maximize();
	        	 //Thread.sleep(8000);
	        	 WebElement username = driver.findElement(By.id("username"));
	        	 waitElement(username,"username");
	        	 enterText(username,readPropertyData("vaild_username"),"vaild-uname");
	           	 WebElement password = driver.findElement(By.id("password"));
	           	 waitElement(password,"password");
	           	enterText(password,readPropertyData("valid_Password"),"vaild-password");
	        	 WebElement loginbutton = driver.findElement(By.id("Login"));
	        	 waitElement(loginbutton,"loginbutton");
	        	 ClickButton(loginbutton,"login-button");
	        	 Thread.sleep(3000);
	        	 driver.close();
	        }
	        public static void loginSalesForce3(String browser) throws InterruptedException, IOException {
	        	System.out.println("Testcase-loginSalesForce3");
	        	getDriver(browser);
	        	 driver.get("https://login.salesforce.com/");
	        	 driver.manage().window().maximize();
	        	 Thread.sleep(8000);
	        	 WebElement username = driver.findElement(By.id("username"));
	        	 enterText(username,readPropertyData("vaild_username"),"vaild-uname");
	           	 WebElement password = driver.findElement(By.id("password"));
	           	enterText(password,readPropertyData("valid_Password"),"vaild-password");
	        	 WebElement reminder = driver.findElement(By.id("rememberUn"));
	        	 ClickButton(reminder,"reminder-button");
	        	
	        	 WebElement loginbutton = driver.findElement(By.id("Login"));
	        	 ClickButton(loginbutton,"login-button");
	        	 Thread.sleep(3000);
	        	 //String title = driver.getTitle();
	        		// System.out.println(title);
	        	 WebElement drpdown = driver.findElement(By.id("userNavLabel"));
	        	 Thread.sleep(3000);
	        	 ClickButton(drpdown,"drpdown-button");
	        	 WebElement logout = driver.findElement(By.linkText("Logout"));
	        	 ClickButton(logout,"logout-button");
	        	 Thread.sleep(3000);
	        	 driver.close();
	        }
	        public static void loginSalesForce4b(String browser) throws InterruptedException, IOException {
	        	System.out.println("Testcase-loginSalesForce4b");
	        	getDriver(browser);
	        	 driver.get("https://login.salesforce.com/");
	        	 driver.manage().window().maximize();
	        	 Thread.sleep(3000);
	        	 WebElement username = driver.findElement(By.id("username"));
	        	 enterText(username,readPropertyData("invaild_username"),"invaild-uname");
	        	// Thread.sleep(3000);
	           	 WebElement password = driver.findElement(By.id("password"));
	          	enterText(password,readPropertyData("invalid_Password"),"invaild-password");
	        	 WebElement loginbutton = driver.findElement(By.id("Login"));
	        	 ClickButton(loginbutton,"login-button");
	        	 Thread.sleep(3000);
	        	 driver.close();
	        }
	    	
	        public static void loginSalesForce4a(String browser) throws InterruptedException, IOException {
	        	System.out.println("Testcase-loginSalesForce4a");
	        	getDriver(browser);
	        	 driver.get("https://login.salesforce.com/");
	        	 driver.manage().window().maximize();
	        	 Thread.sleep(8000);
	        	
	        	 WebElement forgotpwd = driver.findElement(By.id("forgot_password_link"));
	        	 ClickButton(forgotpwd,"forgotpwd-button");
	        
	        	 WebElement username = driver.findElement(By.id("un"));
	        	 enterText(username,readPropertyData("vaild_username"),"vaild-uname");
	        	 WebElement continue1 = driver.findElement(By.id("continue"));
	        	 ClickButton(continue1,"continue1-button");
	        	
	        	 Thread.sleep(3000);
	        	 driver.close();
	    	
	    }

}

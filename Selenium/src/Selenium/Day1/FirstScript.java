package Selenium.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.opera.OperaDriver;

public class FirstScript extends BaseTest {
   
    
    /*public static void AutomationScript(String browser) {
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
        driver.close();
    	
    }*/
	
    
    public static void loginSalesForce(String browser) throws InterruptedException {
    	getDriver(browser);
    	 driver.get("https://login.salesforce.com/");
    	 driver.manage().window().maximize();
    	 Thread.sleep(8000);
    	 WebElement username = driver.findElement(By.id("username"));
    	 username.clear();
    	 username.sendKeys("likithahs@gmail.com");
       	 WebElement password = driver.findElement(By.id("password"));
    	 password.clear();
    	 WebElement loginbutton = driver.findElement(By.id("Login"));
    	 loginbutton.click();
    	 driver.close();
    }
    
    public static void loginSalesForce2(String browser) throws InterruptedException {
    	getDriver(browser);
    	 driver.get("https://login.salesforce.com/");
    	 driver.manage().window().maximize();
    	 Thread.sleep(8000);
    	 WebElement username = driver.findElement(By.id("username"));
    	 username.clear();
    	 username.sendKeys("likithahs@gmail.com");
       	 WebElement password = driver.findElement(By.id("password"));
    	 password.clear();
    	 password.sendKeys("Shaurya$12");
    	 WebElement loginbutton = driver.findElement(By.id("Login"));
    	 loginbutton.click();
    	 //driver.close();
    }
    public static void loginSalesForce3(String browser) throws InterruptedException {
    	String actual = "Home Page";
    	getDriver(browser);
    	 driver.get("https://login.salesforce.com/");
    	 driver.manage().window().maximize();
    	 Thread.sleep(8000);
    	 WebElement username = driver.findElement(By.id("username"));
    	 username.clear();
    	 username.sendKeys("likithahs@gmail.com");
       	 WebElement password = driver.findElement(By.id("password"));
    	 password.clear();
    	 password.sendKeys("Shaurya$12");
    	 WebElement reminder = driver.findElement(By.id("rememberUn"));
    	 reminder.click();
    	 WebElement loginbutton = driver.findElement(By.id("Login"));
    	 loginbutton.click();
    	 Thread.sleep(3000);
    	 //String title = driver.getTitle();
    		// System.out.println(title);
    	 WebElement drpdown = driver.findElement(By.id("userNavLabel"));
    	 Thread.sleep(3000);
    	 drpdown.click();
    	 WebElement logout = driver.findElement(By.linkText("Logout"));
    	 logout.click();
    	
    	// Actions action = new Actions(driver);
    	// action.click(drpdown).build().perform();
    
    	 //driver.close();
    }
    public static void loginSalesForce4b(String browser) throws InterruptedException {
    	getDriver(browser);
    	 driver.get("https://login.salesforce.com/");
    	 driver.manage().window().maximize();
    	 Thread.sleep(8000);
    	 WebElement username = driver.findElement(By.id("username"));
    	 username.clear();
    	 username.sendKeys("123");
       	 WebElement password = driver.findElement(By.id("password"));
    	 password.clear();
    	 password.sendKeys("22131");
    	 WebElement loginbutton = driver.findElement(By.id("Login"));
    	 loginbutton.click();
    	 //driver.close();
    }
	
    public static void loginSalesForce4a(String browser) throws InterruptedException {
    	getDriver(browser);
    	 driver.get("https://login.salesforce.com/");
    	 driver.manage().window().maximize();
    	 Thread.sleep(8000);
    	
    	 WebElement forgotpwd = driver.findElement(By.id("forgot_password_link"));
    	 forgotpwd.click();
    	 WebElement username = driver.findElement(By.id("un"));
    	 username.clear();
    	 username.sendKeys("likithahs@gmail.com");
    	 WebElement continue1 = driver.findElement(By.id("continue"));
    	 continue1.click();
    	 
    	 //driver.close();
    }
	
}

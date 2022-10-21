package com.tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.home.page.HomePage;
import com.login.page.CheckEmailPage;
import com.login.page.ForgotPasswordPage;
import com.login.page.LoginPage;
import com.utility.CommonUtilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLoginStepDefination {
	public static WebDriver driver = null;
	public static WebDriverWait wait = null;
	LoginPage login;
	HomePage homepage;
	ForgotPasswordPage forgotPasswordpage;
	CheckEmailPage checkemailpage;

	@Before
	public void setup() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));

	}

	@Given("when you go to url")
	public void when_you_go_to_url() {
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String url = cu.getApplicationProperty("url", applicationPropertiesFile);
		driver.get(url);
		driver.manage().window().maximize();
		sleep(2);

	}

	public void sleep(int i) {
		try {
			Thread.sleep(i * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("user on {string}")
	public void user_on(String page) {
		if (page.equalsIgnoreCase("loginPage")) {
			login = new LoginPage(driver);
		} else if (page.equalsIgnoreCase("homePage")) {
			homepage = new HomePage(driver);
		} else if (page.equalsIgnoreCase("forgotPasswordPage")) {
			forgotPasswordpage = new ForgotPasswordPage(driver);
		} else if (page.equalsIgnoreCase("checkemailpage")) {
			checkemailpage = new CheckEmailPage(driver);
		}
	}

	@When("i enter value of username")
	public void i_enter_value_of_username() {

		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String valid_username = cu.getApplicationProperty("vaild_username", applicationPropertiesFile);

		login.enterUserName(valid_username);
	}

	@When("i enter value of password")
	public void i_enter_value_of_password() {

		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String valid_Password = cu.getApplicationProperty("valid_Password", applicationPropertiesFile);
		login.enterPassword(valid_Password);

	}

	@When("click on login button")
	public void click_on_login_button() {
		login.clickLoginButton();
	}

	@Then("i should get the page title")
	public void i_should_get_the_page_title() {
		String expected = "Home Page ~ Salesforce - Developer Edition";
		String accepted = homepage.displayPageTitle();
		Assert.assertEquals(accepted, expected);
	}

	@When("no password is entered")
	public void no_password_is_entered() {
		login.clearPassword();

	}

	@Then("i should get error message")
	public void i_should_get_error_message() {
		String expected = "Please enter your password.";
		String accepted = login.getErrorMessage();
		Assert.assertEquals(accepted, expected);
	}

	@When("i enter invalid value of username")
	public void i_enter_invalid_value_of_username() {

		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String invalid_username = cu.getApplicationProperty("invaild_username", applicationPropertiesFile);
		login.enterUserName(invalid_username);

	}

	@When("i enter invalid value of password")
	public void i_enter_invalid_value_of_password() {

		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String invalid_Password = cu.getApplicationProperty("invaild_username", applicationPropertiesFile);
		login.enterPassword(invalid_Password);

	}

	@Then("i should get enter valid username password message")
	public void i_should_get_enter_valid_username_password_message() {

		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		String accepted = login.getErrorMessage();
		Assert.assertEquals(accepted, expected);

	}

	@When("click on remember")
	public void click_on_remember() {

		login.clickReminderButton();
	}

	@When("click on logout")
	public void click_on_logout() {
		homepage.usermenuClick();
		homepage.logoutClick();
	}

	@Then("check for Username and remember")
	public void check_for_username_and_remember() {
		String expected = "likithahs@gmail.com";
		String actual = login.verifyVaildUsername();
		Assert.assertEquals(actual, expected);
		login.verifyReminderSelected();
	}

	@When("click on forgot password")
	public void click_on_forgot_password() {
		login.ForgotPasswordClick();
	}

	@When("i enter value of username in forgotpage")
	public void i_enter_value_of_username_in_forgotpage() {

		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile = cu.loadFile("applicationProperties");
		String valid_username = cu.getApplicationProperty("vaild_username", applicationPropertiesFile);
		forgotPasswordpage.enterUserName(valid_username);

	}

	@When("Click on continue")
	public void click_on_continue() {
		forgotPasswordpage.clickcontinueButton();
	}

	@Then("i should get check email page")
	public void i_should_get_check_email_page() {
		String expected = "Check Your Email | Salesforce";
		String actual = checkemailpage.displayPageTitle();
		Assert.assertEquals(actual, expected);
	}

	public String getscreenshortdriver() {

		TakesScreenshot scrshot = ((TakesScreenshot) driver);
		File src = scrshot.getScreenshotAs(OutputType.FILE);

		File dest = new File(System.getProperty("user.dir") + "/Screenshot/" + System.currentTimeMillis() + ".png");

		try {
			FileHandler.copy(src, dest);
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		String project_root = System.getProperty("user.dir") + "/extentReports";
		String relative = ".".concat(dest.getAbsolutePath().substring(project_root.length()));
		// report.logTestInfo("Relative file path is " + relative);
		return relative;
	}

	@After
	public void tearDown() {
		//String path = getscreenshortdriver();
		//System.out.println("Screenshot taken at path:" + path);
		sleep(2);
		driver.close();
	}
}

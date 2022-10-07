package com.firebase.test.test;
import java.awt.Desktop.Action;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import com.firebase.test.base.BaseTest;
import com.firebase.test.pages.home.HomePage;
import com.firebase.test.pages.login.CheckEmailPage;
import com.firebase.test.pages.login.ForgotPasswordPage;
import com.firebase.test.pages.login.LoginPage;
import com.firebase.test.utility.CommonUtilities;

@Listeners(com.firebase.test.utility.ListenerClass.class)
public class AutomationScript extends BaseTest {
	
	
	@Test
	
	public static void errorMessage01() {
		//logger.info("test case-errorMessage01");
		report.logTestInfo("test case-errorMessage01");
		//defineWait();
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String UsernameString= cu.getApplicationProperty("vaild_username", applicationPropertiesFile);
		LoginPage login=new LoginPage(driver);
		login.loginNoPassword(UsernameString);
		String actual= login.getErrorMessage();
		String expected = "Please enter your password.";
		if(!expected.equals(actual)) {
			report.logTestFailed("errorMessage01 test case failed ");
		}
		Assert.assertEquals(actual, expected);
	}
	@Test
	public static void loginSalesForce2()  {
		
		report.logTestInfo("loginSalesForce2");
		//defineWait();
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String UsernameString= cu.getApplicationProperty("vaild_username", applicationPropertiesFile);
		String passwordString= cu.getApplicationProperty("valid_Password", applicationPropertiesFile);
		LoginPage login=new LoginPage(driver);
		login.login(UsernameString,passwordString);
		HomePage homepage=new  HomePage(driver);
		String actual= homepage.displayPageTitle();
		String expected = "Home Page ~ Salesforce - Developer Edition";
		if(!expected.equals(actual)) {
			report.logTestFailed("LoginSalesForce2 test case failed ");
		}
		Assert.assertEquals(actual, expected);
		

	}
	@Test
	public static void loginSalesForce3() {
		report.logTestInfo("loginSalesForce3");
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String UsernameString= cu.getApplicationProperty("vaild_username", applicationPropertiesFile);
		String passwordString= cu.getApplicationProperty("valid_Password", applicationPropertiesFile);
		LoginPage login=new LoginPage(driver);
		login.clickReminderButton();
		login.login(UsernameString,passwordString);
		HomePage homepage=new  HomePage(driver);
		String actual= homepage.displayPageTitle();
		String expected = "Home Page ~ Salesforce - Developer Edition";
		if(!expected.equals(actual)) {
			report.logTestFailed("loginSalesForce3 test case failed after login with vaild username and passoword");
		}
		Assert.assertEquals(actual, expected);
		homepage.usermenuClick();
		homepage.logoutClick();
		String actual_login= login.displayPageTitle();
		String expected_login = "Login | Salesforce";
		if(!expected_login.equals(actual_login)) {
			report.logTestFailed("loginSalesForce3 test case failed ");
		}
		Assert.assertEquals(actual_login, expected_login);
		String UsernameActual=login.verifyVaildUsername();
		if(!UsernameActual.equals(UsernameString)) {
			report.logTestFailed("loginSalesForce3 test case failed in username validation after logout ");
		}
		Assert.assertEquals(actual_login, expected_login);
		login.verifyReminderSelected();
	}
 @Test
	public static void loginSalesForce4b() {
	  report.logTestInfo("loginSalesForce4b");
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String UsernameString= cu.getApplicationProperty("invaild_username", applicationPropertiesFile);
		String passwordString= cu.getApplicationProperty("invalid_Password", applicationPropertiesFile);
		LoginPage login=new LoginPage(driver);
		login.login(UsernameString,passwordString);
		String actual= login.getErrorMessage();
		String expected = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		if(!expected.equals(actual)) {
			report.logTestFailed("loginSalesForce4b test case failed ");
		}
		Assert.assertEquals(actual, expected);
	}
	@Test
  public static void loginSalesForce4a() {
		
		report.logTestInfo("loginSalesForce4a");
		CommonUtilities cu = new CommonUtilities();
		Properties applicationPropertiesFile=cu.loadFile("applicationProperties");
		String UsernameString= cu.getApplicationProperty("vaild_username", applicationPropertiesFile);
		LoginPage login=new LoginPage(driver);
		login.ForgotPasswordClick();
		ForgotPasswordPage forgotpwd = new ForgotPasswordPage(driver);
		forgotpwd.enterUserName(UsernameString);
		forgotpwd.clickcontinueButton();
		CheckEmailPage checkEmail = new CheckEmailPage(driver);
		String actual = checkEmail.displayPageTitle();
		String expected = "Check Your Email | Salesforce";
		if(!expected.equals(actual)) {
			report.logTestFailed("loginSalesForce4a test case failed ");
		}
		Assert.assertEquals(actual, expected);
  }
}

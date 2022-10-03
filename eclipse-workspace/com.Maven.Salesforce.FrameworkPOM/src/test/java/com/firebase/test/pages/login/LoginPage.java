package com.firebase.test.pages.login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.firebase.test.pages.base.BasePage;

public class LoginPage extends BasePage {
	
  @FindBy(id="username") WebElement username;
  @FindBy(id="password") WebElement password;
  @FindBy(id="Login") WebElement loginbutton;
  @FindBy(id="error") WebElement errorMessage;
  @FindBy(id="rememberUn") WebElement reminder;
  @FindBy(id="forgot_password_link") WebElement forgotPassword;
  
  public LoginPage(WebDriver driver) {
	 super(driver);
  }
  
  public void enterUserName(String usernameString) {
	  waitByVisibility(username,"username");
	  enterText(username, usernameString, "valid-username");
	  
  }
  public void enterPassword(String passwordString) {
	  enterText(password, passwordString, "valid-password");
	  
  }
  public void clearPassword() {
	  clearElement(password, "password-clear");
	  
  }
  public void clickLoginButton() {
	  clickButton(loginbutton, "login-button");
  }
  
  public void clickReminderButton() {
	  waitByVisibility(reminder,"reminder");
	  clickButton(reminder, "reminder");
  }
  
  public void ForgotPasswordClick() {
	  waitByVisibility(forgotPassword,"forgotPassword");
	  clickButton(forgotPassword, "forgotPassword");
  }
  
  public void login(String usernameString, String passwordString) {
	  enterUserName(usernameString);
	  enterPassword(passwordString);
	  clickLoginButton();
  }
  public void loginNoPassword(String usernameString) {
	  enterUserName(usernameString);
	  clearPassword();
	  clickLoginButton();
  }
  public String getErrorMessage() {
	String actual=  errorMessage.getText();
	return actual;
  }
  
  public String displayPageTitle() {
		waitByVisibility(loginbutton, "loginbutton");
		String title=driver.getTitle();
		return title;
	}
  
  public void verifyReminderSelected() {
	  waitByVisibility(reminder, "reminder");
	verifyisSelected(reminder, "reminder");
  }
  
  
}

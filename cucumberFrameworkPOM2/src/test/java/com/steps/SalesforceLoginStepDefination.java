package com.steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLoginStepDefination {
	WebDriver driver=null;
	WebDriverWait wait=null;
	
/*@Before

public void setUp() {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
}

@After

public void tearDown() {
	driver.close();
}*/

/*@Given("when you go to url {string}")
public void when_you_go_to_url(String url) throws InterruptedException {
	
	driver.get(url);
	driver.manage().window().maximize();
    Thread.sleep(2000);
    
}
@When("i enter value of username as {string} and password as {string}")
public void i_enter_value_of_username_as_and_password_as(String usrname, String pswrd) {
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
	WebElement username = driver.findElement(By.id("username"));
	username.clear();
	username.sendKeys(usrname);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
	WebElement password = driver.findElement(By.id("password"));
	password.clear();
	password.sendKeys(pswrd);
	
}
@When("click on login button")
public void click_on_login_button() {
	
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Login")));
	WebElement loginbutton = driver.findElement(By.id("Login"));
	loginbutton.click();
   
}
@Then("i should get the page title as {string}")
public void i_should_get_the_page_title_as(String expected) throws InterruptedException {
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));
	String actual=driver.getTitle();
	Assert.assertEquals(actual, expected);
	Thread.sleep(2000);
	driver.close();
}

@Then("i should get the error message as {string}")
public void i_should_get_the_error_message_as(String expected) throws InterruptedException {
	wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("error")));
	WebElement errorMessage = driver.findElement(By.id("error"));
	String actual=errorMessage.getText();
	Assert.assertEquals(actual, expected);
	Thread.sleep(2000);
	driver.close();
}*/

	}


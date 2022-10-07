package com.Maven.Demo;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Launcher extends WebDriverUtils {
	public void login(String browser, PropertyReader property_reader) throws InterruptedException, IOException {
		System.out.println("Testcase-loginSalesForce2");
		WebDriver driver = getDriver(browser);
		setPageLoadTimeout(driver);
		
		// Load the given URL and maximize it
		driver.get(property_reader.get("url"));
		driver.manage().window().maximize();
		
		// Wait till the username field's visible
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"username\"]")));
		
		// Enter username
		WebElement username = driver.findElement(By.id("username"));
		enterText(username, property_reader.get("vaild_username"), "vaild-uname");

		// Wait until passwords visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"password\"]")));
		
		// Enter password.
		WebElement password = driver.findElement(By.id("password"));
		enterText(password, property_reader.get("valid_Password"), "vaild-password");
		
		// Find and click login button.
		WebElement loginbutton = driver.findElement(By.id("Login"));
		ClickButton(loginbutton, "login-button");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Home")));
		driver.close();
	}
}

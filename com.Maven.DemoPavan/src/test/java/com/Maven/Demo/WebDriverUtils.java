package com.Maven.Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtils {
	public static WebDriver getDriver(String browser) {
		WebDriver driver = null;
		switch (browser) {
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		default:
			break;
		}
		
		return driver;
	}

	public static void enterText(WebElement element, String text, String objName) {
		if (element.isDisplayed()) {
			clearElement(element, objName);
			element.sendKeys(text);
			System.out.println("Text enterted in " + objName + " field");
		} else {
			System.out.println("Fail:" + objName + " element not displayed");
		}
	}

	public static void clearElement(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.clear();
			System.out.println("Pass:" + objName + " element cleared");
		} else {
			System.out.println("Fail:" + objName + " element not cleared");
		}
	}

	public static void ClickButton(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.click();
			System.out.println("Click-pass: " + objName + " field");
		} else {
			System.out.println("Click-Fail:" + objName + " element not displayed");
		}
	}

	public static void setPageLoadTimeout(WebDriver driver) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
	}
}

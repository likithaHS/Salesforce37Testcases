package com.base.page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	protected static WebDriver driver;
	protected static WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public static String getPageTitle() {
		return driver.getTitle();
	}

	public static void refreshPage() {
		driver.navigate().refresh();
		System.out.println("page got refreshed");
	}

	public static void clickButton(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.click();
			// logger.info("Click-pass: " + objName + " field");
			System.out.println("Click-pass: " + objName + " field");
		} else {
			// logger.error("Click-Fail:" + objName + " element not displayed");
			System.out.println("Click-Fail:" + objName + " element not displayed");
		}
	}

	public static void enterText(WebElement element, String text, String objName) {
		if (element.isDisplayed()) {
			clearElement(element, objName);
			element.sendKeys(text);
			// logger.info("Text enterted in " + objName + " field");
			System.out.println("Text enterted in " + objName + " field");
		} else {
			// logger.error("Fail:" + objName + " element not displayed");
			System.out.println("Fail:" + objName + " element not displayed");
		}
	}

	public static void clearElement(WebElement element, String objName) {
		if (element.isDisplayed()) {
			element.clear();
			// logger.info("Pass:" + objName + " element cleared");
			System.out.println("Pass:" + objName + " element cleared");
		} else {
			// logger.error("Fail:" + objName + " element not cleared");
			System.out.println("Fail:" + objName + " element not cleared");
		}
	}

	public static void waitByVisibility(WebElement element, String objName) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(100));
		wait.until(ExpectedConditions.visibilityOf(element));
		System.out.println("Found Element by Visibility:" + objName);

	}

	public static WebElement findByClickable(By locator, String objName) {
		wait.until(ExpectedConditions.elementToBeClickable(locator));
		System.out.println("Element available for click:" + objName);
		return driver.findElement(locator);
	}

	public static void verifyisSelected(WebElement element, String objName) {
		if (element.isSelected()) {
			System.out.println("Pass:" + objName + " element Selecetd");
		} else {
			System.out.println("fail:" + objName + " element not Selecetd");
		}
	}

}

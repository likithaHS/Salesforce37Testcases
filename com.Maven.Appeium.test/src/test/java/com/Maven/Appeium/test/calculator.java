package com.Maven.Appeium.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class calculator {
	public static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(MobileCapabilityType.DEVICE_NAME, "988a5b43414e443543");
		capability.setCapability("platformName", "Android");
		capability.setCapability("platformVersion", "9");

		capability.setCapability("appPackage", "com.sec.android.app.popupcalculator");
		capability.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capability);
	   MobileElement button_5 =  driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"5\"]"));
	/*	driver.findElementByAccessibilityId("Plus").click();
		driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"2\"]")).click();
		driver.findElementByAccessibilityId("Equal").click();
//		Thread.sleep(4000);
//		driver.quit();*/
		
		TouchAction action = new TouchAction(driver);
		action.tap(TapOptions.tapOptions().withElement(ElementOption.element(button_5))).perform();
		Thread.sleep(4000);
	    driver.quit();
		
		
	}

}

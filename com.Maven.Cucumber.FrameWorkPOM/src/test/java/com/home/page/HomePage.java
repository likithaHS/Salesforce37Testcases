package com.home.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.base.page.BasePage;

public class HomePage extends BasePage {

	@FindBy(linkText = "Home")
	WebElement homeTag;
	@FindBy(id = "userNavLabel")
	WebElement usermenu_drpdown;
	@FindBy(linkText = "Logout")
	WebElement logout_button;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public String displayPageTitle() {
		waitByVisibility(homeTag, "Home");
		String title = driver.getTitle();
		return title;
	}

	public void usermenuClick() {
		waitByVisibility(usermenu_drpdown, "usermenu_drpdown");
		clickButton(usermenu_drpdown, "usermenu_drpdown");
	}

	public void logoutClick() {
		waitByVisibility(logout_button, "logout_button");
		clickButton(logout_button, "logout_button");
	}

}

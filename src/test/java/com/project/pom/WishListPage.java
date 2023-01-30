package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WishListPage extends Base{
	
	By loginLocator = By.cssSelector("a[data-auto-id='customer-info-button']");
	By userNameLocator = By.cssSelector("input[id='login-register-auto-flow-input']");
	By passwordLocator = By.cssSelector("input[id='login-password']");
	By visitYourAccountLocator = By.xpath("//div[starts-with(@class,'visit-your-account-link')]");
	
	
	public WishListPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void clickOnLogin() {
		click(loginLocator);
	}
	
}

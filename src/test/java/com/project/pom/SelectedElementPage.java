package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectedElementPage extends Base {
	
	By addWishListSelector = By.xpath("//div[@data-auto-id='add-wishlist-button']");
	By userNameLocator = By.cssSelector("input[id='login-register-auto-flow-input']");
	By continueButtonLocator = By.xpath("//button[@type='submit']");
	By passwordLocator = By.cssSelector("input[id='login-password']");
	By visitYourAccountLocator = By.xpath("//div[starts-with(@class,'visit-your-account-link')]");
	
	public SelectedElementPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void addToWishList() {
		click(addWishListSelector);
		
	}
	
}

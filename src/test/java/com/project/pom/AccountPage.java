package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountPage extends Base{
	
	By accountTab = By.cssSelector("button[id='ACCOUNT']");
	By logOutLocator = By.xpath("//a[@data-auto-id='members-home-account-log-out']");
	By wishListLocator = By.xpath("//a[@data-auto-id='wishlist-button-desktop']");
	
	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnAccountTab() {
		click(accountTab);
	}
	
	public void LogOut() {
		click(logOutLocator);
	}
	
	public void clickOnWishList() {
		click(wishListLocator);
	}

}

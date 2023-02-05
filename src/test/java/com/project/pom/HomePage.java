package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends Base {
	
	By trendingSectionLocator = By.xpath("//div[@data-anchor-id='9']");
	By trendingSelectionLocator = By.xpath("//a[@href='/atletico_junior?sort=newest-to-oldest']");
	By wishListLocator = By.xpath("//a[@data-auto-id='wishlist-button-desktop']");
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	public TrendingPage selectTrend() {
	scrollDown(trendingSectionLocator);
	click(trendingSelectionLocator);
	return new TrendingPage(driver);
	}
	
	public void clickOnWishListButton() {
		click(wishListLocator);
	}
	

	
}

package com.project.pom;

import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

	WebDriver driver;
	protected SelectedElementPage homePage;

	public HomePage goHome() {
		driver.get("https://www.adidas.co");
		homePage = new SelectedElementPage(getDriver());
		driver.manage().window().maximize();
		return new HomePage(driver);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public HomePage loadHomePage() {
		return new HomePage(driver);
	}

}

package com.project.pom;

import org.openqa.selenium.WebDriver;

public abstract class BaseTest {

	WebDriver driver;
	protected SelectedElementPage homePage;

	public void goHome() {
		driver.get("https://www.adidas.co");
		homePage = new SelectedElementPage(getDriver());
		driver.manage().window().maximize();
	}

	public WebDriver getDriver() {
		return driver;
	}

	protected HomePage loadHomePage() {
		return new HomePage(driver);
	}

}

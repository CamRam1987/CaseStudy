package com.project.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.pom.HomePage;

public class HomeTest {
	private WebDriver driver;
	HomePage homepage;

	@BeforeMethod
	public void setUp() throws Exception {
		homepage = new HomePage(driver);
		driver = homepage.chromeDriverConnection();
		homepage.visit("https://www.adidas.co/");
		
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		
		homepage.selectTrend();
		
		
	}
	
}

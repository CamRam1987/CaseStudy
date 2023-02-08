package com.project.tests;

import static org.junit.Assert.*;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.project.pom.BaseTest;
import com.project.pom.HomePage;
import com.project.pom.SelectedElementPage;
import com.project.pom.TrendingPage;



public class AddElementTest extends BaseTest{
	
	private WebDriver driver;
	TrendingPage trendingpage;

	@BeforeMethod
	public void setUp() throws Exception {
		trendingpage = new TrendingPage(driver);
		driver = trendingpage.chromeDriverConnection();
		trendingpage.visit("https://www.adidas.co/");
	}

	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		HomePage homepage = new HomePage(driver);
		TrendingPage selectedelementpage = homepage.selectTrend();
		Assert.assertTrue(selectedelementpage.verifyUrl("https://www.adidas.co/sportswear"));
		//assertEquals(driver.getCurrentUrl(),"https://www.adidas.co/italia?sort=newest-to-oldest");
		
	}

}

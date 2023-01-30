package com.project.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.BaseTest;
import com.project.pom.HomePage;
import com.project.pom.SelectedElementPage;
import com.project.pom.TrendingPage;



public class AddElementTest extends BaseTest{
	private WebDriver driver;
	TrendingPage trendingpage;
	@Before
	public void setUp() throws Exception {
		trendingpage = new TrendingPage(driver);
		driver = trendingpage.chromeDriverConnection();
		trendingpage.visit("https://www.adidas.co/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test() {
		HomePage homepage = loadHomePage();
		TrendingPage selectedelementpage = homepage.selectTrend();
		assertEquals(driver.getCurrentUrl(),"https://www.adidas.co/italia?sort=newest-to-oldest");
		
	}

}

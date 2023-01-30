package com.project.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.TrendingPage;

public class AddElementTest {
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
		//HomePage homepage = 
	}

}

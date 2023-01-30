package com.project.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.project.pom.HomePage;

public class HomeTest {
	private WebDriver driver;
	HomePage homepage;

	@Before
	public void setUp() throws Exception {
		homepage = new HomePage(driver);
		driver = homepage.chromeDriverConnection();
		homepage.visit("https://www.adidas.co/");
		
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() {
		homepage.selectTrend();
		
		
	}
	
}

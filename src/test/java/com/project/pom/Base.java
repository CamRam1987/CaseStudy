package com.project.pom;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Base {
	
	protected CustomWait customWait = new CustomWait();
	protected WebDriver driver;
	
	public Base(WebDriver driver){
		this.driver=driver;
	};
	
	public WebDriver chromeDriverConnection () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\camil\\OneDrive\\Documentos\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> findElements(By locator){
		return driver.findElements(locator);
	}
	public String getText(WebElement element) {
		return element.getText();
	}
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(String inputText, By locator) {
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
		return false;
		}
	}
	
	public void visit(String url) {
		driver.get(url);
	}
	
	public void scrollDown (By locator) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement flag = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView();", flag);
	}
	
	public void elementSelection(By locator, String desiredElement){
		List<WebElement> elements = driver.findElements(locator);
		for(WebElement e :elements) {
			if(e.getText().equalsIgnoreCase(desiredElement)) {
				e.click();
			}
		}
	}
	
	public Boolean verifyUrl(String url) {
		if(driver.getCurrentUrl().equalsIgnoreCase(url)) {
			return true;
		}
		else {
			return false;
		}
	}
}


package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TrendingPage extends Base {
	
	By elementSelector = By.cssSelector("img[alt='Shorts Titular Italia 23 Azul Niño Fútbol']");
	By elementsSelector = By.cssSelector("img[data-auto-id='product-card-image']");
	By closeModalSelector = By.xpath("//button[@class='gl-modal__close");
	String selection = "Shorts Titular Italia 23 Azul Niño Fútbol";
	String url = "https://www.adidas.co/italia?sort=newest-to-oldest";
	public TrendingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public Boolean verifyUrl() {
		return verifyUrl(url);
	}
	
	public SelectedElementPage selectElement() {
		elementSelection(elementsSelector,selection);
		return new SelectedElementPage(driver);
	}

}

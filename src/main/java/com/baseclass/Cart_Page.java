package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart_Page {

	public static WebDriver driver;
	
	@FindBy(xpath = "//a[@title='View my shopping cart']")
	private WebElement cartcheck;

	public Cart_Page(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver2, this);
	}

	public WebElement getCartcheck() {
		return cartcheck;
	}

	
	
	
	


}


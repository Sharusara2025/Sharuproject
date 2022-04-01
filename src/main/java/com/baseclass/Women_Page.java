package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Women'])[1]")
	private WebElement women;
	
	@FindBy(xpath ="(//a[@title='T-shirts'])[1]")
	private WebElement tshirt;
	
	@FindBy(className = "product-container")
	private WebElement tshirtimage;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement tshirtsubmit;
	
	@FindBy(xpath = "//span[@title='Continue shopping']")
	private WebElement tshirtcontinueshopping;
	
	@FindBy(xpath = "//a[@title='Blouses']")
	private WebElement blouses;
	
	public WebElement getWomen() {
		return women;
	}

	public WebElement getTshirt() {
		return tshirt;
	}

	public WebElement getTshirtimage() {
		return tshirtimage;
	}

	public WebElement getTshirtsubmit() {
		return tshirtsubmit;
	}

	public WebElement getTshirtcontinueshopping() {
		return tshirtcontinueshopping;
	}

	public WebElement getBlouses() {
		return blouses;
	}

	public WebElement getBlouseimage() {
		return blouseimage;
	}

	public WebElement getBlousesubmit() {
		return blousesubmit;
	}

	public WebElement getBlousecontinueshopping() {
		return blousecontinueshopping;
	}

	@FindBy(className = "product-container")
	private WebElement blouseimage;
	
	@FindBy(xpath = "(//button[@type='submit'])[3]")
	private WebElement blousesubmit;
	
	@FindBy(xpath = "//span[@title='Continue shopping']")
	private WebElement blousecontinueshopping;
	
	
	
	
	
	
	
	public Women_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	
	
	
}

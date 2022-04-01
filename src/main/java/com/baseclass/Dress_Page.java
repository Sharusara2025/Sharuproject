
package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dress_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='Women'])[1]")
	private WebElement women;
	
	@FindBy(xpath = "(//a[text()='Casual Dresses'])[1]")
	private WebElement casualdress;
	
	@FindBy(className ="product-container")
	private WebElement casualimage;
	
	@FindBy(xpath ="//button[@name='Submit']")
	private WebElement casualaddtocart;
	
	@FindBy(xpath = "//span[@title='Continue shopping']")
	private WebElement casualcontinueshopping;
	
	@FindBy(xpath = "(//a[text()='Evening Dresses'])[1]")
	private WebElement eveningdress;
	
	@FindBy(className ="product-container")
	private WebElement eveningimage;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement eveningaddtocart;
	
	@FindBy(xpath = "//span[@title='Continue shopping']")
	private WebElement eveningcontinueshopping;
	
	@FindBy(xpath = "(//a[text()='Summer Dresses'])[1]")
	private WebElement summerdress;
	
	@FindBy(className ="product-container")
	private WebElement summerimage;
	
	@FindBy(xpath = "//button[@name='Submit']")
	private WebElement summeraddtocart;

	public Dress_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver2, this);
	
	}
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasualdress() {
		return casualdress;
	}

	public WebElement getCasualimage() {
		return casualimage;
	}

	public WebElement getCasualaddtocart() {
		return casualaddtocart;
	}

	public WebElement getCasualcontinueshopping() {
		return casualcontinueshopping;
	}

	public WebElement getEveningdress() {
		return eveningdress;
	}

	public WebElement getEveningimage() {
		return eveningimage;
	}

	public WebElement getEveningaddtocart() {
		return eveningaddtocart;
	}

	public WebElement getEveningcontinueshopping() {
		return eveningcontinueshopping;
	}

	public WebElement getSummerdress() {
		return summerdress;
	}

	public WebElement getSummerimage() {
		return summerimage;
	}

	public WebElement getSummeraddtocart() {
		return summeraddtocart;
	}
	
	

}


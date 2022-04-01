package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Other_Functions {
	
	public static WebDriver driver;
	
	@FindBy(className = "login")
	private WebElement login;
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(id = "passwd")
	private WebElement password;
	

	@FindBy(name = "SubmitLogin")
	private WebElement submitlogin;
	
	@FindBy(className = "account")
	private WebElement account;
	
	@FindBy(xpath = "//span[text()='Order history and details']")
	private WebElement orderdetails;
	
	@FindBy(xpath ="(//a[@class='btn btn-default button button-small'])[8]")
	private WebElement homepage;

	public Other_Functions(WebDriver driver2) {
		this .driver =driver2;
		PageFactory.initElements(driver2, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getOrderdetails() {
		return orderdetails;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitlogin() {
		return submitlogin;
	}

	public WebElement getHomepage() {
		return homepage;
	}
	
	

}

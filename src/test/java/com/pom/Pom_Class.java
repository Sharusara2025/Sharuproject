package com.pom;

import org.openqa.selenium.WebDriver;

import com.baseclass.Cart_Page;
import com.baseclass.Dress_Page;
import com.baseclass.Other_Functions;
import com.baseclass.Women_Page;

public class Pom_Class {
	
	public static WebDriver driver;
	
	private Women_Page wp;
	private Dress_Page dp;
	private Cart_Page  cp;
	private Other_Functions other;
	
	
	
	
	public Pom_Class(WebDriver driver2) {
		this.driver = driver2;
	}



	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
	public Women_Page getWp() {
		wp = new Women_Page(driver);
		return wp;
	}
	public Dress_Page getDp() {
		dp = new Dress_Page(driver);
		return dp;
	}
	public Cart_Page getCp() {
		cp = new Cart_Page(driver);
		return cp;
	}
	public Other_Functions getOther() {
		other = new Other_Functions(driver);
		return other;
	}
	
	


}

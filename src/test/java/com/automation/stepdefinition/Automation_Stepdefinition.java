package com.automation.stepdefinition;



import static org.junit.Assert.assertTrue;
import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.sound.midi.SysexMessage;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.automation.runner.Automation_Runner;
import com.baseclass.Base_Class;
import com.pom.Pom_Class;

import io.cucumber.java.en.*;

public class Automation_Stepdefinition  extends Base_Class{
	
	
	public static WebDriver driver = Automation_Runner.driver ;
	
	public static JavascriptExecutor js = (JavascriptExecutor) driver;
	public static Actions act = new Actions(driver);

	
	Pom_Class p =new Pom_Class(driver);
	
	@Given("user select tshirt and added to cart")
	public void user_select_tshirt_and_added_to_cart() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		max();
		urlget("http://automationpractice.com/index.php");
		System.out.println("User logged in the site");
		
		actionMethod(p.getWp().getWomen());
		act.moveToElement(p.getWp().getWomen());
		act.moveToElement(p.getWp().getTshirt());
		Thread.sleep(2000);
		clickelement(p.getWp().getTshirt());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getWp().getTshirtimage());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getWp().getTshirtsubmit());
		System.out.println("Shirt added on cart");
	Thread.sleep(3000);
	
	}
	@When("user clicks on continue shopping1")
	public void user_clicks_on_continue_shopping1() throws InterruptedException {
		Thread.sleep(3000);
		clickelement(p.getWp().getTshirtcontinueshopping());
		System.out.println("User continue shopping");
	}
	@When("user select blouse and added to cart")
	public void user_select_blouse_and_added_to_cart() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-200)");
		actionMethod(p.getWp().getWomen());
		act.moveToElement(p.getWp().getWomen());
		act.moveToElement(p.getWp().getBlouses());
		clickelement(p.getWp().getBlouses());
		js.executeScript("window.scrollBy(0,300)");
		clickelement(p.getWp().getBlouseimage());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getWp().getBlousesubmit());
		System.out.println("Blouse added on cart");
		Thread.sleep(3000);
		clickelement(p.getWp().getBlousecontinueshopping());
		System.out.println("User continue shopping");
	}
	@Then("user validate the current page1")
	public void user_validate_the_current_page1() {
		assertTrue(driver.getCurrentUrl().endsWith("&controller=product"));
		System.out.println("User selected Tshirt and Blouse");
	}
	@Given("user select casual dress and added to cart")
	public void user_select_casual_dress_and_added_to_cart() {
		actionMethod(p.getDp().getWomen());
		act.moveToElement(p.getDp().getCasualdress());
		clickelement(p.getDp().getCasualdress());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getDp().getCasualimage());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getDp().getCasualaddtocart());
		System.out.println("Casual dress added on cart");
	
	}
	@When("user clicks on continue shopping2")
	public void user_clicks_on_continue_shopping2() throws InterruptedException {
		Thread.sleep(3000);
		clickelement(p.getDp().getCasualcontinueshopping());
		System.out.println("User continue shopping");
	}
	@When("user select evening dress and added to cart")
	public void user_select_evening_dress_and_added_to_cart() {
		actionMethod(p.getDp().getWomen());
		act.moveToElement(p.getDp().getEveningdress());
		clickelement(p.getDp().getEveningdress());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getDp().getEveningimage());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getDp().getEveningaddtocart());
		System.out.println("Evening dress added on cart");
	}
	@When("user clicks on continue shopping3")
	public void user_clicks_on_continue_shopping3() throws InterruptedException {
		Thread.sleep(3000);
		clickelement(p.getDp().getCasualcontinueshopping());
		System.out.println("User continue shopping");
	}
	@When("user select summer dress and added to cart")
	public void user_select_summer_dress_and_added_to_cart() {
		actionMethod(p.getDp().getWomen());
		act.moveToElement(p.getDp().getSummerdress());
		clickelement(p.getDp().getSummerdress());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getDp().getSummerimage());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getDp().getSummeraddtocart());
		System.out.println("Summer dress added on cart");
	}
	@Then("user validate the current page2")
	public void user_validate_the_current_page2() {
		assertTrue(driver.getCurrentUrl().endsWith("&controller=product"));
		System.out.println("User added all dresses ");
	}
	@Given("user will check the product on cart")
	public void user_will_check_the_product_on_cart() throws Throwable {
		clickelement(p.getCp().getCartcheck());
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,800)");
	}
	@When("user will take screenshot of the cartpage")
	public void user_will_take_screenshot_of_the_cartpage() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src  = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\sharu\\eclipse-workspace\\CucumberAutomation\\Screenshot\\img1.png");
		FileUtils.copyFileToDirectory(src, dest);
	}
	@Given("user wants to go back to login page")
	public void user_wants_to_go_back_to_login_page() {
		clickelement(p.getOther().getLogin());
		js.executeScript("window.scrollBy(0,-500)");
		sendvalues(p.getOther().getEmail(),"sharuramesh97@gmail.com");
		sendvalues(p.getOther().getPassword(), "Sharusara@20");
		clickelement(p.getOther().getSubmitlogin());
		clickelement(p.getOther().getAccount());
	}
	@When("user check order history and details and return to homepage")
	public void user_check_order_history_and_details_and_return_to_homepage() {
		clickelement(p.getOther().getOrderdetails());
		js.executeScript("window.scrollBy(0,500)");
		clickelement(p.getOther().getHomepage());
		System.out.println("Page navigated to homepage");
	}
	@Then("user validate the home page")
	public void user_validate_the_home_page() {
		assertTrue(driver.getCurrentUrl().endsWith("/index.php"));
		System.out.println("Validation done ");
	}








}

package com.baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {


public static WebDriver driver ;
//-----------------------driver launch-----------------------------
public static WebDriver launch(String browser) {
if(browser.equalsIgnoreCase("Chrome")) {
//System.setProperty("webdriver.chrome.driver","F:\\JAVA PROGRAMS\\Java_Selenium\\driver\\chromedriver.exe");
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();

}
else if (browser.equalsIgnoreCase("gecko")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}

else {
System.out.println("Invalid browser");
}
return driver; 
}
//------------------------get url------------------------------------
public static void urlget(String url) {
driver.get(url);
}//------------------------window maximize----------------------------
public static void max() {
driver.manage().window().maximize();
}
//------------------------window minimize----------------------------
public static void min() {
driver.manage().window().minimize();
}
//-------------------------get current url---------------------------
public static String currenUrl() {
return driver.getCurrentUrl();
}
//------------------------get title----------------------------------
public static String gettitle() {
return driver.getTitle();
}
//------------------------navigate forward---------------------------
public static void forward() {
driver.navigate().forward();
}
//------------------------navigate backward--------------------------
public static void backward() {
driver.navigate().back();
}
//------------------------navigate refresh---------------------------
public static void refresh() {
driver.navigate().refresh();
}
//------------------------navigate to--------------------------------
public static void navto(String url) {
driver.navigate().to(url);
}
//---------------------------quit------------------------------------
public static void qt() {
driver.quit();
}
//---------------------------close-----------------------------------
public static void cls() {
driver.close();
}
//------------------------send keys----------------------------------
public static void sendvalues(WebElement element,String i) {
element.sendKeys(i);
}
//------------------------click element------------------------------
public static void clickelement(WebElement elementTwo) {
elementTwo.click();
}
//------------------------clear element------------------------------
public static void clearelement(WebElement elementThree) {
elementThree.clear();
} 
//------------------------findelement xpath---------------------------
public static WebElement find(String path) {
return driver.findElement(By.xpath(path));
}
//-----------------------Alerts---------------------------------------
public static void simpleAlert() {
driver.switchTo().alert().accept();
}
public static void confirmAlert(String ok,String cancel) {
if(ok.equalsIgnoreCase("ok")) {
driver.switchTo().alert().accept();
}
else if(cancel.equalsIgnoreCase("cancel")) {
driver.switchTo().alert().dismiss();
 }
 }
public static void promptAlert(String ok,String value,String cancel) {
if(ok.equalsIgnoreCase("ok")){
driver.switchTo().alert().sendKeys(value);
driver.switchTo().alert().accept();
}
else if(cancel.equalsIgnoreCase("cancel")) {
driver.switchTo().alert().sendKeys(value);
driver.switchTo().alert().dismiss();
} }
//-------------------------Screen shot--------------------------------
public static void srcst(String path) throws IOException {
TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File des=new File(path);
FileUtils.copyFile(src, des);
}
//--------------------------scroll down-------------------------------
public static void pageDown(WebElement element) {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
}
public static void pageUp(WebElement element) {
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.scrollTo(0,document.body.scrollTop)");
}
//------------------mouse over actions-------------------------------------
public static void actionMethod(WebElement element) {
Actions ac=new Actions(driver);
ac.moveToElement(element).build().perform();
}
public static void actionMethodTwo(WebElement element) {
Actions as=new Actions(driver);
as.contextClick(element).build().perform();
}
//------------------Robot class---------------------------------------------
public static void robot() throws AWTException {
Robot r=new Robot();
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
}
//-------------------Windows handles-----------------------------------------
public static void windowHandles() {
Set<String> element=driver.getWindowHandles();
for(String st:element) {
String title=driver.switchTo().window(st).getTitle();
} }
//---------------------------Frames-------------------------------------------
public static void frameMethod(String option,String value,WebElement element) {
if(option.equalsIgnoreCase("byIndex")) {
int index=Integer.parseInt(value);
driver.switchTo().frame(index);
}
else if (option.equalsIgnoreCase("byElement")) {
driver.switchTo().frame(element);
}
else if (option.equalsIgnoreCase("byvalue")) {
driver.switchTo().frame(value);
}
else {
System.out.println("Invalid framr selection");
} }
public static void dropdown(WebElement element,String option,String value) {
	Select sc =new Select(element);
	if (option.equalsIgnoreCase("byIndex")) {
		int parseInt = Integer.parseInt(value);
		sc.selectByIndex(parseInt);
	}
	else if (option.equalsIgnoreCase("byValue")) {
		sc.selectByValue(value);
	}
	else if (option.equalsIgnoreCase("visibletext")) {
		sc.selectByVisibleText(value);
		
	}
	else {
		System.out.println("Invalid options");
	}
}


}


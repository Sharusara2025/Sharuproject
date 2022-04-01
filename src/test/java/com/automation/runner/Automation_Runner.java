package com.automation.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseclass.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\automation\\feature", glue ="com\\automation\\stepdefinition",dryRun=false,
plugin={"pretty"},monochrome=true)
public class Automation_Runner {

	
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		driver =Base_Class.launch("chrome");
	}
}

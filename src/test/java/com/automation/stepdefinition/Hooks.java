package com.automation.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.automation.runner.Automation_Runner;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {
	
	public static WebDriver driver = Automation_Runner.driver;
	
	@Before
	public void beforeHooks(Scenario sc) {
		String name = sc.getName();
		System.out.println("Scenario name :" + name);
	}
	@After
	public void afterHooks(Scenario sc) throws IOException {
		Status status = sc.getStatus();
		System.out.println("Scenario status :"+status);
		
		if (sc.isFailed()) {
			TakesScreenshot tk = (TakesScreenshot) driver ;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File dest =new File("C:\\Users\\sharu\\eclipse-workspace\\CucumberAutomation\\Screenshot\\img.png");
			FileUtils.copyFileToDirectory(src, dest);
		}
	}
	
	

}

package com.runner;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebElement;

import Com.base.Base_class;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\91999\\eclipse-workspace\\Lime_Road\\src\\test\\java\\com\\feature\\limelogin.feature", 
glue="com.step",
plugin= {"pretty",
		"json:Res/limejson",
		//"html:R/lime.html",
//		dryRun = false,
//		strict = true,
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})



public class Runner_class extends Base_class {
	public WebElement getLogin() {
		return getLogin();
	}
	}



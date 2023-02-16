package com.example.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", 
                 features = "src/test/resources/features/LoginPage.feature", 
                 glue = "com.example.page.stepDefinitions",
                 plugin= {"pretty", 
                		  "html:test-output",
                		  "json:target/cucumber/cucumber.json", 
                		  "html:target/cucumber-html-report",
                		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class CucumberRunner extends AbstractTestNGCucumberTests {

}

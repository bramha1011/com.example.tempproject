package com.example.cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
   
@CucumberOptions(tags = "", features = "src/test/resources/features/LoginPage.feature", glue = "com.example.page.stepDefinitions",
                 plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
   
public class CucumberRunnerBackUP extends AbstractTestNGCucumberTests {
   
}

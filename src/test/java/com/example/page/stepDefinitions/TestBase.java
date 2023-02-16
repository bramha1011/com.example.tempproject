package com.example.page.stepDefinitions;






import com.example.driver.SeleniumDriverClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;


public class TestBase {

	     
	    @Before
	    public static void setUp() {
	 
	       SeleniumDriverClass.setUpDriver();
	    }
	     
	    @After
	    public static void tearDown() {
	    	/* 
	        //validate if scenario has failed
	        if(scenario.isFailed()) {
	            final byte[] screenshot = ((TakesScreenshot) SeleniumDriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", scenario.getName()); 
	        }   
	        
	        */
	     
	        SeleniumDriverClass.tearDown();
	    }    
	
}

package com.example.page.actions;

import org.openqa.selenium.support.PageFactory;

import com.example.driver.SeleniumDriverClass;
import com.example.page.locators.HomePageLocators;

public class HomePageActions {

	
	 HomePageLocators homePageLocators = null;
	    
	    public HomePageActions() {
	         
	        this.homePageLocators = new HomePageLocators();
	 
	        PageFactory.initElements(SeleniumDriverClass.getDriver(),homePageLocators);
	    }
	  
	    // Get the User name from Home Page
	    public String getHomePageText() {
	        return homePageLocators.homePageUserName.getText();
	
	    }
}

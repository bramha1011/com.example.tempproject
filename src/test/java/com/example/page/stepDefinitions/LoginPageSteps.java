package com.example.page.stepDefinitions;

import org.testng.Assert;

import com.example.driver.SeleniumDriverClass;
import com.example.page.actions.HomePageActions;
import com.example.page.actions.LoginPageActions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	LoginPageActions objLogin = new LoginPageActions();
    HomePageActions objHomePage = new HomePageActions();
    
         
  
    @Given("User is on HRMLogin page {string}")
    public void user_is_on_hrm_login_page(String url) {
         
        SeleniumDriverClass.openPage(url);
  
    }
  
    @When("User enters username as {string} and password as {string}")
    public void user_enters_username_as_and_password_as(String userName, String passWord) {
  
        // login to application
        objLogin.login(userName, passWord);
  
        // go the next page
         
    }
     
    @Then("User should be able to login successfully and new page open")
    public void user_should_be_able_to_login_successfully_and_new_page_open() {
  
        // Verify home page
        Assert.assertTrue(objHomePage.getHomePageText().contains("Dashboard"));
  
    }
     
	
}

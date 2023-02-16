package com.example.driver;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriverClass {

	private static SeleniumDriverClass seleniumDriverClass;
    
    private static WebDriver driver;
    private static WebDriverWait wait;
    public final static int TIMEOUT = 30;
    public final static int PAGE_LOAD_TIMEOUT = 50;
    
    public static String highlight;
     
     private SeleniumDriverClass() {
          
          
            
    	 WebDriverManager.chromedriver().setup();
         driver = new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
         driver.manage().window().maximize();   
       //  waitDriver = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));	            
         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));
         String window=driver.getWindowHandle();
         System.out.println("Window ->"+window);
 
     }      
             
    public static void openPage(String url) {
        driver.get(url);
    }
     
    public static WebDriver getDriver() {
        return driver;
                 
    }
     
    public static void setUpDriver() {
         
        if (seleniumDriverClass==null) {
             
        	seleniumDriverClass = new SeleniumDriverClass();
        }
    }
 
     public static void tearDown() {
          
         if(driver!=null) {
             driver.close();
             driver.quit();
         }
          
         seleniumDriverClass = null;
 
     } 
     
     
	
}

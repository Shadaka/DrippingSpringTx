package com.nexttech.stepdefs;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.BestSellerPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BestSeller {

	WebDriver driver;
	
	@Given("^user visits Amazon Bestseller$")
	
	public void user_visits_Amazon_Bestseller() throws Throwable {
	  
		  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		  driver = new ChromeDriver();
		  			  
	       driver.get("https://amazon.com/");
	    
	   
	}

	@When("^user clicks on Bestseller Options$")
	public void user_clicks_on_Bestseller_Options() throws Throwable {
	    
		BestSellerPOM bestsell = new BestSellerPOM(driver);
		bestsell.bestseller().click();
		
	}

	@Then("^User should be able to redirect the Bestseller Page$")
	public void user_should_be_able_to_redirect_the_Bestseller_Page() throws Throwable {
	    
	    
	}


}
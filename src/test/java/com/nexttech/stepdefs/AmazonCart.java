package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.AmazonCartPOM;
import com.nexttech.pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonCart {
	
WebDriver driver;

	@Given("^user visit Amazon page$")
	public void user_visit_Amazon_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
	   
	}

	@When("^user type desirable \"([^\"]*)\"$")
	public void user_type_desirable(String arg1) throws Throwable {
		AmazonCartPOM  Amazon = new AmazonCartPOM (driver);
		Amazon.AmazonCart().sendKeys(arg1);
	}

	@When("^user click to the search button$")
	public void user_click_to_the_search_button() throws Throwable {
		AmazonCartPOM  Amazon = new AmazonCartPOM (driver);
		Amazon.SearchBox().click();
	}

	@Then("^user able to choose the product$")
	public void user_able_to_choose_the_product() throws Throwable {
		AmazonCartPOM  Amazon = new AmazonCartPOM (driver);
		Amazon.product().click();
	}

	@Then("^User select the Add to Cart option$")
	public void user_select_the_Add_to_Cart_option() throws Throwable {
		AmazonCartPOM  Amazon = new AmazonCartPOM (driver);
		Amazon.AddtoCart().click();
	}


	
	
}

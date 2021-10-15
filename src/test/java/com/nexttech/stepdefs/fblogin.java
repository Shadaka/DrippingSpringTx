package com.nexttech.stepdefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttech.pageobjectmodel.fbloginPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class fblogin {
	
	WebDriver driver;
	
	@Given("^user lands Facebook url$")
	public void user_lands_Facebook_url() throws Throwable {
		//for open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com"); //open the url
	}

	@When("^user inputs \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_inputs_and(String arg1, String arg2) throws Throwable {
		fbloginPOM obj = new fbloginPOM(driver);
		//(POM class name) (variable) = new (Pom class name) (global driver);
		obj.email().sendKeys(arg1);
		obj.password().sendKeys(arg2); 
		// obj=variable, password=method ,sendkeys=typeable, arg=1 data 
	}

	@Then("^user is able to visit Facebook login option$")
	public void user_is_able_to_visit_Facebook_login_option() throws Throwable {
		
		fbloginPOM obj = new fbloginPOM(driver);
		obj.login().click();
	}



}

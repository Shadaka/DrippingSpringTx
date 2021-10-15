package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.Orangehrm_CareersPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangehrm_Careers {
	
	WebDriver driver;

	@Given("^user goes to  Orangehrm homepage$")
	public void user_goes_to_Orangehrm_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//how to maximize window
		driver.manage().window().maximize();
		
		//how to open url
		driver.get("http://www.orangehrm.com/");
	}

	@When("^user goes to company dropdown menu and see Careers option and click Careers option$")
	public void user_goes_to_company_dropdown_menu_and_see_Careers_option_and_click_Careers_option() throws Throwable {
	  
		Actions act = new Actions (driver);
		Orangehrm_CareersPOM obj = new Orangehrm_CareersPOM (driver);
		act.moveToElement(obj.company()).build().perform();
		obj.Careers().click();
		
		Thread.sleep(5000);
	}

	@Then("^user able to redirect to Careers page$")
	public void user_able_to_redirect_to_Careers_page() throws Throwable {
	}

}

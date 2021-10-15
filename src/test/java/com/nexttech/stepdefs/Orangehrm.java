package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.OrangehrmPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangehrm {
	WebDriver driver;

	@Given("^user visit Orangehrm homepage$")
	public void user_visit_Orangehrm_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//how to maximize window
		driver.manage().window().maximize();
		
		//how to open url  driver.get method
		driver.get("http://www.orangehrm.com/");
		
	}

	@When("^user goes to company dropdown menu and see Aboutus option and click over there$")
	public void user_goes_to_company_dropdown_menu_and_see_Aboutus_option_and_click_over_there() throws Throwable {
	   
		Actions act = new Actions (driver);
		OrangehrmPOM obj = new OrangehrmPOM(driver);
		act.moveToElement(obj.company()).build().perform();
		obj.Aboutus().click();
		
		Thread.sleep(5000);
	}

	@Then("^user can be able to redirect to Aboutus page$")
	public void user_can_be_able_to_redirect_to_Aboutus_page() throws Throwable {
	}

}

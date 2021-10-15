package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.nexttech.pageobjectmodel.Orangehrm_Free_DemoPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Orangehrm_Free_Demo {
	
	WebDriver driver;
	

	@Given("^user lands to Orangehrm page$")
	public void user_lands_to_Orangehrm_page() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		//soft wait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//how to maximize window
		driver.manage().window().maximize();
		
		//how to open url  driver.get method
		driver.get("http://www.orangehrm.com/");
		
	}

	@When("^user go to click get a free demo option$")
	public void user_go_to_click_get_a_free_demo_option() throws Throwable {
		
		Orangehrm_Free_DemoPOM demo = new Orangehrm_Free_DemoPOM(driver);
				demo.freedemo().click();
				
	}

	@When("^user goes to \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_goes_to_and_and_and(String arg1, String arg2, String arg3, String arg4) throws Throwable {
	   
		Orangehrm_Free_DemoPOM obj = new Orangehrm_Free_DemoPOM(driver);
		
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.phonenumber().sendKeys(arg4);
		
	}

	@Then("^user click to dropdown country option$")
	public void user_click_to_dropdown_country_option() throws Throwable {
		Orangehrm_Free_DemoPOM demo = new Orangehrm_Free_DemoPOM(driver);
				
				Select dropdown = new Select (demo.country());
				dropdown.selectByVisibleText("Unied States");
	}

	@When("^user click i not a robot option$")
	public void user_click_i_not_a_robot_option() throws Throwable {
		Orangehrm_Free_DemoPOM demo = new Orangehrm_Free_DemoPOM(driver);
				demo.robot().click();
		
	}

	@Then("^user click to get a free demo option$")
	public void user_click_to_get_a_free_demo_option() throws Throwable {
		Orangehrm_Free_DemoPOM demo = new Orangehrm_Free_DemoPOM(driver);
				demo.freedemo().click();
		
	}

	@Then("^user can go to visit Orangehrm get a free demo option$")
	public void user_can_go_to_visit_Orangehrm_get_a_free_demo_option() throws Throwable {
		Orangehrm_Free_DemoPOM demo = new Orangehrm_Free_DemoPOM(driver);
				demo.freedemo().click();
	}


}

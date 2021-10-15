package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.SignupfbPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Signupfb {
	WebDriver driver;
  
	
	@Given("^user visit Facebook page$")
	public void user_visit_Facebook_page() throws Throwable {
		
		try {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
				
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
						
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		
		SignupfbPOM create = new SignupfbPOM(driver);  
		 create.creatbutton().click();
	
	}
	
	catch(Exception e) {
		System.out.println("Browser & URL is not working");
	}
	}

	@When("^user goes to \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\"$")
	public void user_goes_to(String arg1, String arg2, String arg3, String arg4, String arg5) throws Throwable {
		
		try {
		
        SignupfbPOM obj = new SignupfbPOM(driver); 
		
		obj.firstname().sendKeys(arg1);
		obj.lastname().sendKeys(arg2);
		obj.email().sendKeys(arg3);
		obj.confirmemail().sendKeys(arg4);
		obj.password().sendKeys(arg5);
		
		WebDriverWait Wait = new WebDriverWait(driver,20); 
		
	}
	
	catch(Exception e) {
		System.out.println("Browser & URL is not working");
	}
}
      //================================================================================================

	@Then("^user click dropdown month and dropdown day and dropdown year$")
	public void user_click_dropdown_month_and_dropdown_day_and_dropdown_year() throws Throwable {
		
		SignupfbPOM sel = new SignupfbPOM(driver); //this is the obj for POM class
		
		Select dropdown = new Select (sel.month);
		//dropdown=obj name and its changeable, sel = obj name
		dropdown.selectByIndex(8); //index start from 0
		
		Select dropdown1 = new Select (sel.day);
		dropdown1.selectByValue("10"); //value start from 1
		
		Select dropdown2 = new Select (sel.year);
		dropdown2.selectByVisibleText("1999"); //string value, it should be double"
		//if i want choose visible text
}

	@Then("^user click genderoption and click signup$")
	public void user_click_genderoption_and_click_signup() throws Throwable {
		
		SignupfbPOM gender = new SignupfbPOM(driver);
		gender.female().click();
		gender.Signup().click();
		
	}

	@Then("^user access to visit Facebook signup option$")
	public void user_access_to_visit_Facebook_signup_option() throws Throwable {
			
		//driver.quit();
    	

}
}
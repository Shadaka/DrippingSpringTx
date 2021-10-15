package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.dellsollutionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellsollution {
	WebDriver driver;


@Given("^uservisit dell homepage$")
public void uservisit_dell_homepage() throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize(); 
	
	driver.get("https://deals.dell.com/en-us");  //declare url 
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //implicityWait 
	
	
}

@When("^user open the dropdown sollution window and move to the  smail business$")
public void user_open_the_dropdown_sollution_window_and_move_to_the_smail_business() throws Throwable {
	
	Actions act = new Actions(driver);
	
	 dellsollutionPOM obj = new  dellsollutionPOM(driver);
	 act.moveToElement(obj.sollution()).build().perform();
	 Thread.sleep(4000);
	 act.moveToElement(obj.SmaillBussiness()).build().perform();
//	 act.moveToElement(obj.SmaillBussinessSollution()).build().perform();
}

@Then("^user able to click the smaill bussiness sollution$")
public void user_able_to_click_the_smaill_bussiness_sollution() throws Throwable {
	 dellsollutionPOM obj = new  dellsollutionPOM(driver);
	 obj.SmaillBussinessSollution().click();
	 Thread.sleep(40000);
	 driver.quit();
	    
	
}
}
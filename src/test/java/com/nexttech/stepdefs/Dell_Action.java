package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttech.pageobjectmodel.Dell_ActionPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Dell_Action {
	WebDriver driver;
	
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		//this is code to open the browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		   //soft wait
		 driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); //implicit wait
				     
				       //how to maximize the browser
		 driver.manage().window().maximize();
						 
					  //how to open url  driver.get method
		 driver.get("https://www.dell.com/en-us");

	}

	@When("^user go to Solutions dropdown menu and able to see View BigData$")
	public void user_go_to_Solutions_dropdown_menu_and_able_to_see_View_BigData() throws Throwable {
	   
		Actions act =new Actions (driver);
		Dell_ActionPOM  obj =new Dell_ActionPOM (driver);  //object from Page Object Model (POM) class
		act.moveToElement(obj.Solutions()).build().perform();
		
		//obj.AllSolutions().click();
		//obj.BigData().click();
		 
		//heard wait
		// Thread.sleep(2000);
	    
	

	
	
	obj.SmallBusiness().click();
	act.moveToElement(obj.SmallBusiness()).build().perform();  // want to go small business to Small business solutions window
	obj.SmallSolutions().click();
	
	}

	@Then("^user redirects to solution portfolio$")
	public void user_redirects_to_solution_portfolio() throws Throwable {
		
		
		//heard wait
		 Thread.sleep(2000);
	    
		
		//how to close the window
		 //	driver.close();
			driver.quit();

	}


}

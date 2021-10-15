package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.PayBill_and_ManageAccountPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PayBill_and_ManageAccount {

	WebDriver driver;
	
	@Given("^user press dell\\.com$")
	public void user_press_dell_com() throws Throwable {
		try {
			
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize(); 
		
		
		driver.get("https://deals.dell.com/en-us");  //declare url 
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //implicityWait 	
	 
	
}
		catch(Exception e) {
		System.out.println("This Given Contain an error");	
		}
		}
	
	@When("^user hover on the Finanching$")
	public void user_hover_on_the_Finanching() throws Throwable {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver ,20);
			Actions act = new Actions(driver);
			PayBill_and_ManageAccountPOM obj =  new PayBill_and_ManageAccountPOM(driver); 
			act.moveToElement(obj.finanching()).build().perform();
		}
		catch(Exception e) {
			System.out.println("Got eroor in finanching");
		}
	}

	@Then("^user click on dell pay bill and manage$")
	public void user_click_on_dell_pay_bill_and_manage() throws Throwable {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver ,20);
			PayBill_and_ManageAccountPOM obj =  new PayBill_and_ManageAccountPOM(driver); 
			obj.PayBill_and_ManageAccount().click();
			}
			catch(Exception e) {
				System.out.println("Got error in dell pay bill and manage click");
			}
	}

	@Then("^user edit email \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_edit_email_and_password(String arg1, String arg2) throws Throwable {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver ,20);
			PayBill_and_ManageAccountPOM obj =  new PayBill_and_ManageAccountPOM(driver); 
			obj.email().sendKeys(arg1);
			obj.password().sendKeys(arg2);
			}
			catch(Exception e) {
				System.out.println("Got error in editing email and password");
			}
	}

	@Then("^user click on Signin$")
	public void user_click_on_Signin() throws Throwable {
		
		try {
			WebDriverWait wait = new WebDriverWait(driver ,20);
			PayBill_and_ManageAccountPOM obj =  new PayBill_and_ManageAccountPOM(driver); 
			obj.signIn().click();
			}
			catch(Exception e) {
				System.out.println("Got error in clicking SignIn");
			}
	}

	@Then("^user able to Signin successfully$")
	public void user_able_to_Signin_successfully() throws Throwable {
		
		try {
			Thread.sleep(1000);
			driver.close();
			
			
			}
			catch(Exception e) {
				System.out.println("");
			}
		    
		    
	}


	
}

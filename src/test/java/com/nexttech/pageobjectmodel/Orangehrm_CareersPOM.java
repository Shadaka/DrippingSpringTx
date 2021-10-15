package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrm_CareersPOM {
	
	WebDriver driver;
	
	public Orangehrm_CareersPOM(WebDriver driver) {
	this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
		   WebElement act_company;
		   public WebElement company(){
			return act_company;		   
		   
		   }

		   @FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/ul/div/div/div/p[5]/a")
		   WebElement click_Careers;
		   public WebElement Careers(){
			   
		   return click_Careers;
		   
		   }

}

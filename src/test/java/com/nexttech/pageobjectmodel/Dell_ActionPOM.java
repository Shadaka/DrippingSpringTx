package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dell_ActionPOM {
	
	WebDriver driver;
	 public   Dell_ActionPOM(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")  // Locator of solution
	 WebElement act_Solutions;  //declare webelement
	 public WebElement Solutions() {  //method
	  return act_Solutions;  //return webelement
	  }

	/* @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[6]/a")
	 // Big Data locator
	 WebElement click_BigData;
     public WebElement BigData() {
		return click_BigData; 
    */
	 
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/a")
	 WebElement act_SmallBusiness;
	 public WebElement SmallBusiness() { 
	 return act_SmallBusiness;
	  }
	 
	 @FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/ul/li[5]/a")
	 WebElement act_Business;
	 public WebElement SmallSolutions() { 
	 return act_Business;
	  }
	 

}

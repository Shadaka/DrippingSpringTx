package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orangehrm_Free_DemoPOM {
	
WebDriver driver;

  public Orangehrm_Free_DemoPOM(WebDriver driver){
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
	

@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
   WebElement act_company;
   public WebElement company(){
	return act_company;
   } 

   @FindBy(xpath="//*[@id=\"header-navbar\"]/ul[3]/li[2]/a")
   WebElement click_freedemo;
   public WebElement freedemo(){
	return click_freedemo;
	
   }
   @FindBy(xpath="//*[@id=\"Form_submitForm_FirstName\"]")
   WebElement edit_firstname ;
   public WebElement firstname () {
	return edit_firstname;
   	
   }
   	
   @FindBy(xpath="//*[@id=\"Form_submitForm_LastName\"]")
   WebElement edit_lastname ;
   public WebElement lastname () {
	return edit_lastname;
   	
   	
   }

   @FindBy(xpath="//*[@id=\"Form_submitForm_Email\"]")
   WebElement edit_email;
   public WebElement email() {
	return edit_email;
   	
   }
   @FindBy(xpath="//*[@id=\"Form_submitForm_Contact\"]")
   WebElement edit_phonenumber;
   public WebElement phonenumber() {
	return edit_phonenumber;
	
	
}
   
   @FindBy(xpath="//*[@id=\"Form_submitForm_Country\"]")
	WebElement select_country;
	public WebElement country () {
		return select_country;
	}
		

   	

   @FindBy(xpath="//*[@id=\"recaptcha-anchor-label\"]")
   WebElement click_robot;
   public WebElement robot() {
	return click_robot;
	
}
}
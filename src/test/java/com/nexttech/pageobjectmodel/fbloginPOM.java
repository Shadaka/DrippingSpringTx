package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fbloginPOM { //constructor
	WebDriver driver;//webdriver=interface, driver=global driver
	 
	   /*
	    * constructor is not a method but special type of method
	    * 1. Constructor name should be match with classname
	    * 2. it has no return type (void)
	    */
	    public fbloginPOM (WebDriver driver) 
	    //public=access modifier, fbloginPOM=class name(webdriver=interface, driver=local driver)
	  {
	    this.driver=driver;
	    //global driver=local driver
	   
	    PageFactory.initElements(driver, this);
	    }
	    /*PageFactory is a page obj model, where we gonna keep web elements here, its from a 
	    liabrary. its gonna help to keep our webelements. By creating the obj we have to create 
	    web elements.
	   */
	   
	   
		  
	  @FindBy(id="email") //i have to keep my xpath or locator here
	   WebElement edit_email;  //method
	   public WebElement email(){
		return edit_email;
	 

}
	   @FindBy(id="pass")
	   WebElement edit_password;
	   public WebElement password(){
		return edit_password;
		
	  
	   }
	   
	   @FindBy(name="login")
	   WebElement click_login;
	   public WebElement login(){
		return click_login;
		//click=typable, login = method
}
}

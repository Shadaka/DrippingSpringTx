package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestbuyPOM {
	
	WebDriver driver;  //global driver  // here driver is a variable 
	/*
	 * Global driber has power to move anywhere
	 * to execute our chrome browser we have chrome driver.
	chrome driver helps to run chrome browser, through the driver we r using or
	executing test cases using chrome browser
	
	 */
	  public BestbuyPOM (WebDriver driver) { // this driver also variable
		  //local driver and here driver is a constructor
		  
	    this.driver=driver;
	/*
	 *  it says, this is the class, global driver & local driver is same. here they r 
	 *  shaking their hand, we r same, there is a business contact and a deal with us.
	 */
	    PageFactory.initElements(driver, this);   //local driver
	   }
	  
	  @FindBy(xpath="//a[@href=\"/site/clp-global/shop-confidently/pcmcat1584713369767.c?id=pcmcat1584713369767\"]")
	  WebElement click_Bestbuy;
	  public WebElement Bestbuy(){
	  return click_Bestbuy;
	   
	  }
	  
	  
	  
	  @FindBy(id="nav-search-submit-button")
	  WebElement click_searchbutton;
	  public WebElement searchbutton(){
	  return click_searchbutton;
	   

}

}

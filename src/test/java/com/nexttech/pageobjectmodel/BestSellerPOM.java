package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellerPOM {
	WebDriver driver; //global driver
	
	/*
	 * constructor is not a method but special type of method
	 * 1. Constructor name should be match with classname
	 * 2. it has no return type
	 */
	
	 public BestSellerPOM (WebDriver driver) { // this driver is local driver 
		    this.driver=driver;              //bcoz this driver inside a constructor
		   
		    PageFactory.initElements(driver, this);
		   }
	

@FindBy(xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers_8a080d3d7b55497ea1bdd97b7cff8b7b\"]")
   WebElement click_bestseller;
   public WebElement bestseller(){
	   return click_bestseller;
   }




}
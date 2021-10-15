package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonsearchPOM {  //constructor 
	
	WebDriver driver;//global
	 
	 
	  public AmazonsearchPOM (WebDriver driver) {
	    this.driver=driver;//local
	   
	    PageFactory.initElements(driver, this);
	   }
	  
	  @FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	  WebElement edit_serchbox;
	  public WebElement Search(){
	  return edit_serchbox;
	   
	  }
	  @FindBy(id="searchbox")
	  WebElement click_searchbutton;
	  public WebElement searchbutton(){
	  return click_searchbutton;
	   

}

}

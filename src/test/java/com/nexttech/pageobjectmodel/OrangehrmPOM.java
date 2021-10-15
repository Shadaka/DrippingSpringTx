package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangehrmPOM {
	
	WebDriver driver;
	public OrangehrmPOM(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	@FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/a")
	   WebElement act_company;  //declare webelement
	   public WebElement company(){  // public method
	   return act_company; // return webelement

	
	}
	   
	   @FindBy(xpath="//*[@id=\"header-navbar\"]/ul[1]/li[4]/ul/div/div/div/p[1]/a")
	   WebElement click_Aboutus;
	   public WebElement Aboutus(){
	   return click_Aboutus;
	   
}
	   }
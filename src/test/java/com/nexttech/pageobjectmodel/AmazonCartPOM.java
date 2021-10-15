package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonCartPOM {
	
	WebDriver driver;
	
	public AmazonCartPOM (WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);	
	}
	
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]")
	   WebElement edit_AmazonCart ;
	   public WebElement AmazonCart (){
		return edit_AmazonCart;
	 }
	   
	   @FindBy(xpath="//input[@id=\"nav-search-submit-button\"]")
	   WebElement click_SearchBox ;
	   public WebElement SearchBox (){
		return click_SearchBox;
	}
	   
	   @FindBy(xpath="//img[@alt=\"BabyBjörn Toy for Bouncer, Googly Eyes Pastels\"]")
	   WebElement click_product ;
	   public WebElement product (){
		return click_product;
					   
    }
     
	   @FindBy(xpath="//input[@id=\"add-to-cart-button\"]")
	   WebElement click_AddtoCart ;
	   public WebElement AddtoCart (){
		return click_AddtoCart;
					   
    }

}
package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellsollutionPOM {
	WebDriver driver;
	
	public dellsollutionPOM(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
	
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/a/span")
 WebElement act_sollution;
 public WebElement sollution(){
	return act_sollution;
	
}
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/a")
WebElement act_SmaillBussiness;
public  WebElement SmaillBussiness(){
	return act_SmaillBussiness;
	
}
@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[2]/ul/li[5]/ul/li[3]/a")
WebElement click_SmaillBussinessSollution;
public WebElement SmaillBussinessSollution( ){
	return click_SmaillBussinessSollution;
	
}

}
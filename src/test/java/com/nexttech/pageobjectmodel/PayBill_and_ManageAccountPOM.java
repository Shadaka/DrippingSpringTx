package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBill_and_ManageAccountPOM {
	
WebDriver driver;
	
	public  PayBill_and_ManageAccountPOM(WebDriver driver) {
		this.driver =driver;
		PageFactory.initElements( driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/a/span")
	WebElement hover_finanching;
	public WebElement finanching() {
		return hover_finanching;
		
	}
	@FindBy(xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/ul/li[5]/a")
	WebElement click_paybillandManageAccound;
	public WebElement paybillandManageAccound () {
		return click_paybillandManageAccound;
		
	}
	@FindBy(xpath="//input[@id=\"sfid-username\"]")
	WebElement edit_email;
	public WebElement email () {
		return edit_email;
		
	}
	@FindBy(xpath="//input[@id=\"sfid-password\"]")
	WebElement edit_password;
	public WebElement password () {
		return edit_password;
		
	}
	
	@FindBy(id="sfid-submit")
	WebElement click_signIn;
	public WebElement signIn () {
		return click_signIn;
		
	}
	
}

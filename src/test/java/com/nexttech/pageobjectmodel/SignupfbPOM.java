package com.nexttech.pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupfbPOM {
WebDriver driver;

public SignupfbPOM(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a") // Full xpath as a locator              
WebElement click_createbutton;
public WebElement creatbutton(){
return click_createbutton;
}
	
@FindBy(xpath="//*[@id=\"content\"]/div/div/div[2]/a")
WebElement click_createNewAccount ;
public WebElement createNewAccount () {
	return click_createNewAccount;
	
}

@FindBy(xpath="//input[@name=\"firstname\"]")
WebElement edit_firstname ;
public WebElement firstname () {
	return edit_firstname;
}
	
@FindBy(xpath="//input[@name=\"lastname\"]")
WebElement edit_lastname ;
public WebElement lastname () {
	return edit_lastname;
	
}

@FindBy(xpath="//input[@name=\"reg_email__\"]")
WebElement edit_email;
public WebElement email() {
	return edit_email;

}

@FindBy(name="reg_email_confirmation__")
WebElement edit_confirmemail;
public WebElement confirmemail() {
	return edit_confirmemail;
	
	
}

@FindBy(xpath="//input[@data-type=\"password\"]")
WebElement edit_password;
public WebElement password() {
	return edit_password;

}

@FindBy(id="month")
public WebElement month;

@FindBy(id="day")
public WebElement day;

@FindBy(id="year")
public WebElement year;

/*@FindBy(name="reg_month__")
public WebElement month; 



@FindBy(name="reg_day__")
public WebElement day; 


@FindBy(name="reg_year__") 
public WebElement year;
*/

@FindBy(name="sex")
WebElement click_GenderOption;
public WebElement female(){
	return click_GenderOption;
}

@FindBy(name="websubmit")
WebElement click_Signup;
public WebElement Signup(){
	return click_Signup;

}	 

	
}

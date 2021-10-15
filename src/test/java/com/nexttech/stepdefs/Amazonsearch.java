package com.nexttech.stepdefs;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttech.pageobjectmodel.AmazonsearchPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazonsearch {
	
WebDriver driver;
	
	@Given("^user visit amazon home page$")
	public void user_visit_amazon_home_page() throws Throwable {		
		try {
			
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		/*it's soft wait means it execute upto 20 sec, if it take 30 sec not then it may be
		 *  server issue,then may be it will execeute within 25 sec.
		 */
		// how to max window to get all our web element visible
		
		driver.manage().window().maximize();
		//Thread.sleep(5000);
		
		driver.get("https://www.amazon.com/");
		
	
		driver.get("url");
	   
	}
		catch(Exception e) {
			System.out.println("browser is not opening");
	}
	}
	@Given("^user search by \"([^\"]*)\"$")
	public void user_search_by(String arg1) throws Throwable {
		AmazonsearchPOM  AS= new AmazonsearchPOM (driver);
		AS.Search().sendKeys(arg1);
		WebDriverWait Wait = new WebDriverWait(driver,20);
		//it's a wait time, here declare the time in seconds
		//webdriverwait and explicit wait is samething, there has no difference
	}

	@Then("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		AmazonsearchPOM  AS= new AmazonsearchPOM (driver);
		AS.searchbutton().click();
		WebDriverWait Wait = new WebDriverWait(driver,20);
		//how to 
		driver.close();
		driver.quit();
		
	/*hread.sleep(20);hard wait means we have to wait for 20 sec
	*ard wait we use normally to check our code, it it working or not
	*it's a hard wait, means i have to wait,forcefully telling them to stop within 5sec
	*
    */
	}

}

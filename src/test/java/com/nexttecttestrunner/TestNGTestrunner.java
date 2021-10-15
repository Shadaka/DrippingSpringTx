package com.nexttecttestrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestNGTestrunner {

	@CucumberOptions (
		      features = {"Features"},
		      glue = {"com.nexttech.stepdefs"},
		      //tags = {""} 
		      tags= {"@select3","@action","@sc2"}
		      )
		    public class TestRunner extends AbstractTestNGCucumberTests{}

}

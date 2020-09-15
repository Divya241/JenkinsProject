package com.runner4;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\features",glue= {"com.stepdef"},monochrome=true,plugin= {"pretty","json:src\\test\\resources\\Reporting\\cucumber.json"} ,tags= {"@Smoke or @Regression or @retest"})

public class TestRunner4 {
	@AfterClass
	public static void afterClass() {
		
	}
	

}

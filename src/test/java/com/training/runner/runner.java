package com.training.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\anura\\eclipse-workspace\\CucumberBasic\\src\\test\\resources\\features\\Usermenu.feature",
				  glue= {"com.training.steps"},
				  plugin = {"pretty", "html:target/cucumber-reports/cucumber.html",
						  			  "json:target/cucumber-reports/cucumber.json"})
public class runner {

}

package com.automationpractice;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//comment yerlan
@RunWith(Cucumber.class)
@CucumberOptions(//tags={"@SearchForAnItem"},
				plugin={"html:target/html"},
				dryRun=false)
public class Runner {
	
}

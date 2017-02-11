package com.automationpractice.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Base{
	
	@Before
	public void setUp(){
		APADriver.setDriver("chrome");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@After//called after HOOK
	public void tearDown(Scenario scenario){
		if(scenario.isFailed()){
			final byte[]screenshot=((TakesScreenshot)driver).getScreenshotAs(
					OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		driver.quit();
	}
}

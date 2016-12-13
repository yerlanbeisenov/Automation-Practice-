package com.automationpractice.utilities;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class APADriver extends Base{
	public static void setDriver(String driverType){
		if(driverType.equalsIgnoreCase("firefox")){
			System.setProperty(APInputs.FIREFOX_DRIVER, 
					APInputs.FIREFOX_DRIVER_LOCATION);
			driver =  new FirefoxDriver();}
		else if(driverType.equalsIgnoreCase("chrome")){
			System.setProperty(APInputs.CHROME_DRIVER, 
					APInputs.CHROME_DRIVER_LOCATION);
		driver = new ChromeDriver();}
	}
}

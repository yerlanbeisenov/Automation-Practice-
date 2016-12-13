package com.automationpractice.utilities;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Browser extends Base{
	
	public void verifyText(String text){
		if(text.isEmpty())fail("Empty text was passed to VerifyText method");
		try{assertTrue("Text Not Match To "+text, driver.findElement(By
				.xpath("//*[.='"+text+"']")).isDisplayed());}
		catch(Exception e){fail("Text Is Not Found: "+text);}
	}
	
	public void verifyLink(String linkText){
		if(linkText.isEmpty())fail("Empty text was passed to VerifyText method");
		try{assertTrue(linkText+" Link Not Visiable", driver.findElement(By
				.linkText(linkText)).isDisplayed());}
		catch(Exception e){fail("Text Is Not Found: "+linkText);}
	}
	
	public void verifyLinkByPartialText(String linkText){
		if(linkText.isEmpty())fail("Empty text was passed to verifyLinkPartialText method");
		try{waitFor(By.xpath("//*[contains(text(),'"+linkText+"')]"));
		assertTrue("PartialText is not displayed: "+linkText, driver.findElement(By
				.xpath("//*[contains(text(),'"+linkText+"')]")).isDisplayed());//*[.='t']
		}catch(Exception e){fail("PartialText hhh Its not Found: "+linkText);}
	}
	
	public static void waitFor(By by){
		new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(by));
		//*[contains(text(),'Something went wrong')]"
	}
}
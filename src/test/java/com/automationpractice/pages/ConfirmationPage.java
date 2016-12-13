package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class ConfirmationPage extends Base{
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[.='Order confirmation']")
	public WebElement orderConfirmation;
	
	@FindBy(className="box")
	public WebElement confirmationText;
}

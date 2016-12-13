package com.automationpractice.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class AddressesPage extends Base{
	public AddressesPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[.='Your delivery address']")
	public WebElement deliveryAddress;
	
	@FindBy(xpath="//*[.='Your billing address']")
	public WebElement billingAddress;
	
	@FindBy(xpath="//button[@name='processAddress']")
	public WebElement checkoutButton;
}

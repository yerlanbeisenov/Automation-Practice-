package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class ShippingPage extends Base{
	public ShippingPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="delivery_option_price")
	public WebElement shippingPrice;
	
	@FindBy(name="cgv")
	public WebElement agreeToTerm;
	
	@FindBy(xpath="//button[@name='processCarrier'][1]")
	public WebElement checkoutButton;
}

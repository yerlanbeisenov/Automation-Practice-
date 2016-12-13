package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class PaymentMethodPage extends Base{
	public PaymentMethodPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="bankwire")
	public WebElement bankWirePayment;
	
	@FindBy(className="cheque")
	public WebElement checkPayment;
	
	@FindBy(xpath="//button[@class='button btn btn-default button-medium'][1]")
	public WebElement confimMyOrderButton;
}

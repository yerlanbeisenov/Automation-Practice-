package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class ShoppingCartPage extends Base{
	
	public ShoppingCartPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="icon-plus")
	public WebElement increaseQty;
	
	@FindBy(className="icon-minus")
	public WebElement decreaseQty;
	
	@FindBy(className="icon-trash")
	public WebElement deleteAnItem;
	
	@FindBy(linkText="Proceed to checkout")
	public WebElement checkoutButton;
}

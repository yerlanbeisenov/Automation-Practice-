package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class APHomePage extends Base{
	public APHomePage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@class='logo img-responsive']")
	public WebElement homePageLogo;
	
	@FindBy(className="login")
	public WebElement logInButton;
	
}

package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class SignInPage extends Base{
	
	public SignInPage() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="email")
	public WebElement emailAddress;
	
	@FindBy(id="passwd")
	public WebElement password;
	
	@FindBy(id="SubmitLogin")
	public WebElement signIn;
	
	@FindBy(xpath="//div[@class='alert alert-danger']//li")
	public WebElement errorMessage;
}

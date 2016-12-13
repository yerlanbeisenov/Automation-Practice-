package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;

public class MyAccountPage extends Base{
	public MyAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(className="page-heading")
	public WebElement myAccount;
	
	@FindBy(name="search_query")
	public WebElement searchInput;
	
	@FindBy(name="submit_search")
	public WebElement searchButton;
}

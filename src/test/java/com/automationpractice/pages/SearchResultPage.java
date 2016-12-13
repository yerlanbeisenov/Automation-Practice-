package com.automationpractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.utilities.Base;


public class SearchResultPage extends Base{
	
	public SearchResultPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='product-count'])[1]")
	public WebElement numberOfResults;
	
	@FindBy(xpath="//h5[@itemprop='name']")
	public WebElement nameOfAnItem;
	
	@FindBy(className="heading-counter")
	public WebElement NoResultsWereFoundMessage;
	
	@FindBy(xpath="//p[@class='alert alert-warning']")
	public WebElement AlertWarningMessage;
	
	@FindBy(partialLinkText="Proceed to checkout")
	public WebElement proceedToChekoutButton;
}

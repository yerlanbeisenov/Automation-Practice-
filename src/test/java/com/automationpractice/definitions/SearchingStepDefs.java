package com.automationpractice.definitions;

import static org.junit.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automationpractice.pages.MyAccountPage;
import com.automationpractice.pages.SearchResultPage;
import com.automationpractice.utilities.Base;
import com.automationpractice.utilities.Browser;

import cucumber.api.java.en.Then;

public class SearchingStepDefs extends Base{
	MyAccountPage myAcc = new MyAccountPage();
	SearchResultPage searchResults = new SearchResultPage();
	
	@Then("^I searching an item \"([^\"]*)\"$")
	public void i_searching_an_item(String item) throws Throwable {
		myAcc.searchInput.sendKeys(item);
		myAcc.searchButton.click();
	}
	
	@Then("^I should be able to see results$")
	public void i_should_be_able_to_see_results() throws Throwable {
		try{String [] numberOfItems = searchResults.numberOfResults.getText()
				.split(" ");
		for(int i = 1;i<=Integer.parseInt(numberOfItems[3]);i++){
			System.out.println(i+" Item: "+driver.findElement(By
					.xpath("(//h5[@itemprop='name'])["+i+"]")).getText());}}
		catch(Exception e){searchResults.NoResultsWereFoundMessage.isDisplayed();
		fail(searchResults.NoResultsWereFoundMessage.getText()+"\n"
				+searchResults.AlertWarningMessage.getText());}
	}
	
	@Then("^I should be able to add first item in the shopping cart$")
	public void i_should_be_able_to_add_first_item_in_the_shopping_cart() throws Throwable {
		driver.findElement(By.xpath("//*[.='Add to cart'][1]")).click();
		new Browser().verifyLinkByPartialText("Proceed to checkout");
		searchResults.proceedToChekoutButton.click();
	}
}

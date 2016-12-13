package com.automationpractice.definitions;

import static org.junit.Assert.assertTrue;

import com.automationpractice.pages.APHomePage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.utilities.APInputs;
import com.automationpractice.utilities.Base;
import com.automationpractice.utilities.Browser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PositiveLogInStepDefs extends Base{
	
	APHomePage hp = new APHomePage();
	SignInPage si = new SignInPage();
	
	@Given("^Automation Practice Home Page$")
	public void automation_Practice_Home_Page() throws Throwable {
		driver.get(APInputs.URL);
		assertTrue(hp.homePageLogo.isDisplayed());
	}

	@Given("^I enter valid user name and password$")
	public void i_enter_valid_user_name_and_password() throws Throwable {
		si.emailAddress.sendKeys(APInputs.CLIENT_USER_NAME);
		si.password.sendKeys(APInputs.CLIENT_PWD);
		si.signIn.click();
	}

	@Then("^I click on LogIn$")
	public void i_click_on_LogIn() throws Throwable {
		hp.logInButton.click();
	}
	
	@Then("^I should see \"([^\"]*)\"$")
	public void i_should_see(String text) throws Throwable {
//		try{assertEquals(new MyAccountPage().myAccount.getText().toLowerCase(), 
//				text.toLowerCase());}
//		catch(Exception e){fail("My Account not found");}
		new Browser().verifyText(text);
	}
//	@Then("^I should see \"([^\"]*)\"$")
//	public void i_should_see(String text) throws Throwable {
//		try{assertEquals(new MyAccountPage().myAccount.getText().toLowerCase(), 
//				text.toLowerCase());}
//		catch(Exception e){fail("My Account not found");}
//	}
	
	@Then("^I should text \"([^\"]*)\"$")
	public void i_should_text(String linkText) throws Throwable {
		new Browser().verifyLink(linkText);
	}
}

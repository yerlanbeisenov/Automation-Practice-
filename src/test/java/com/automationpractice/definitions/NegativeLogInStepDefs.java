package com.automationpractice.definitions;

import com.automationpractice.pages.SignInPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class NegativeLogInStepDefs {
	SignInPage sp = new SignInPage();
	
	@Given("^I enter e-mail \"([^\"]*)\" and pwd \"([^\"]*)\"$")
	public void i_enter_e_mail_and_pwd(String email, String pwd) throws Throwable {
		sp.emailAddress.sendKeys(email);
		sp.password.sendKeys(pwd);
		sp.signIn.click();
	}

	@Then("^I should see an error message$")
	public void i_should_see_an_error_message() throws Throwable {
		System.out.println(sp.errorMessage.getText());
	}
}

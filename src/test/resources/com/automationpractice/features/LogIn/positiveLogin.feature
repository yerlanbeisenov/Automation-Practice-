Feature: Automation Practice Positive Log In 

	As a Client, I should be able to log into the system with valid credentials

Background: 
	Given Automation Practice Home Page 
	And  I click on LogIn 
	
@positiveLogIn 
Scenario Outline: Client Logs In With Valid Credentials 
	Then I enter valid user name and password 
	And I should see "My account"
	And I should text "<linkText>"
Examples:
		|				   linkText|
		| ORDER HISTORY AND DETAILS|
		|	     	MY CREDIT SLIPS|
		|	           MY ADDRESSES|
		|	MY PERSONAL INFORMATION|
		|			   MY WISHLISTS|
@NegativeTest 
Feature: Automation Practice Negative Log In 

	As a Client, I should NOT be able to log into the system with Invalid credentials
	
Background: 
	Given Automation Practice Home Page 
	And  I click on LogIn 
@IncorrectEmail	
Scenario Outline: Log In with Incorrect email format and valid password 
	And I enter e-mail "<email>" and pwd "yerlan" 
	Then I should see an error message 
	Examples: 
		|		email|
		| 	      	 |
		|bad@emailcom|
		|  @email.com|
		|bademail.com|
		|    bad@.com|
		|  bad@email.|
		|       @.com|
@IncorrectPassword	
Scenario Outline: Log In with valid email format and Invalid and Blank password
	And I enter e-mail "tuxi@9me.site" and pwd "<password>" 
	Then I should see an error message	
	Examples:
		|	password|
		|	 	    |
		|	 invalid|
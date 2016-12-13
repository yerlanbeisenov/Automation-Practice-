@SearchForAnItem 
Feature: Adding an item to the cart 

	As A Client, I Should Be Able To Add An Item To The Shopping Cart

Background: 
	Given Automation Practice Home Page 
	And  I click on LogIn 
	And I enter valid user name and password 
	
Scenario Outline: Search for an Item 
	Then I searching an item "<item>" 
	Then I should be able to see results 
	And I should be able to add first item in the shopping cart 
	And I should be able to change a qty of the item, delete the item, and see a price 
	Then I should be able to see shipping and billing address 
	Then I should be able to see a price for shipping 
	Then I should be able to choose payment options and confirm my order 
	Then I should be able to see an confirmation page 
	Examples: 
		|  item|
		| dress|
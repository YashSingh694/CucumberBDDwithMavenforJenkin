Feature: Customers 


Scenario: Add new Customer 
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboad 
	When User click on customers Menu 
	And click on customers Menu Item 
	And click on Add new button 
	Then User can view Add new customer page 
	When User enter customer info 
	And click on Save button 
	Then User can view confirmation message "The new customer has been added successfully." 
	And close browser

@Testing
Scenario Outline: Delete the user
  Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboad 
	When User click on customers Menu 
	And click on customers Menu Item 
	And Enter customer EMail as "<email>"
	When Click on search button
	Then User should found Email "<email>" as in the Search table
	When click on EditBtn
	Then Page Title should be "Edit customer details / nopCommerce administration"
	And Add the following details
	|Yash|
	|Singh|
	|Testing Edit functionality|
	And click on Save button
	Then User can view confirmation message "The customer has been updated successfully."
	And close browser
	Examples: 
		| email |
		|victoria_victoria@nopCommerce.com|
	
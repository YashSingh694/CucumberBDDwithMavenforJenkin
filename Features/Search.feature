Feature: Customers

@regression
Scenario: Search Customer by EMailID 
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboad 
	When User click on customers Menu 
	And click on customers Menu Item 
	And Enter customer EMail
	When Click on search button
	Then User should found Email in the Search table
	And close browser 
	
@regression
Scenario: Search Customer by Name
	Given User Launch Chrome browser 
	When User opens URL "http://admin-demo.nopcommerce.com/login" 
	And User enters Email as "admin@yourstore.com" and Password as "admin" 
	And Click on Login 
	Then User can view Dashboad 
	When User click on customers Menu 
	And click on customers Menu Item 
	And Enter customer FirstName
	And Enter customer LastName
	When Click on search button
	Then User should found Name in the Search table
	And close browser 
	

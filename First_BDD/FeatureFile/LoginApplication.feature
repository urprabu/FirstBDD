Feature: Login to guru99 bank Application 

Background: 
	Given User navigates to demo application login page 
	
Scenario: User logins with valid crenditial 

	Then  User eneter the username as mngr330611 
	Then User enters the pwd as hezahyg 
	And user clicks login button 
	Then the User login is sucessful 
	
Scenario Outline: User logins with valid crenditial 
	Then  User eneter the username as <username>> 
	Then User enters the pwd as <password> 
	And user clicks login button 
	Then the User login is sucessful 
	
	Examples: 
		| username    | password  |
		| mngr330611  | hezahyg   |

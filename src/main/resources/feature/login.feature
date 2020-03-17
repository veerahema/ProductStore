Feature: Login 
	In order to buy something
	As a customer
	I want to get access to the portal
	
Background: Below are the common steps for the scenarios 
	Given I have browser with demoblaze page 
	
Scenario: Valid Signup 
	When I enter username as 'veerahema.g' and password as 'veerahema' 
	Then I should get popup as 'Sign up successful.' 
		
Scenario: Invalid signup with blank username/password 
	When I enter blankusername as '' and password as 'veerahema' 
	Then I should get error popup as 'Please fill out Username and Password.' 
	
	
Scenario Outline: Valid Credential 
	When I enter username as '<username>' and I enter password as '<password>' 
	Then I should have login to the account 
	
	Examples: 
		|username|password|
		|veerahemagovada@gmail.com|veerahema|
		|kavyakalathuru1998@gmail.com|kavyakalathuru|
		|oohasri234@gmail.com|9493824001|
		
		
Scenario: Invalid Password Credential 
	When I enter valid username as 'veerahemagovada@gmail.com' and invalid password as '23drttun5' 
	Then I should get error popup message as 'Wrong password.' 
	
Scenario: Invalid Username Credential 
	When I enter Invalid username as 'veerah@gmail.com' and password as 'veerahema' 
	Then I should get error popup textmessage as 'User does not exist.' 
	
Scenario: Blank Username or password 
	When I enter blank username as '' and password as 'veerahema' 
	Then I should get error message as 'please fill out username and password' 
	
Scenario: valid filling contact 
	When I enter valid recepeintEmail as 'kavyakalathuru1998@gmail.com' and recepientName as 'kavyakalathuru' and message as 'want to buy a mobile' 
	Then I should get complete contact filling popup message as 'Thanks for the message!!' 
	
Scenario: Contact Blank fill 
	When I will not enter valid recepientEmail as '' and recepientName as '' and message as '' 
	Then I should get popup message without filling details as 'Thanks for the message!!'

Scenario: selecting a product in the home page 
	When I click on the product in home page and click on add to cart 
	Then I should get a popup message as 'Product added' 
	
Scenario: selecting a product in the next page 
	When I click on next and selcet a product and add to cart 
	Then It should navigate to the next page and I should get a popup message as 'Product added' 
	
Scenario: Deleting a product from the cart 
	When I click on delete 
	Then The product should be deleted 
	
Scenario: Placing order 
	When I click on place order 
	Then it should display 'Place order' form for filling details 
	
Scenario: Filling all details for purchase 
	When I enter name as 'hema' and country as 'India' and City as 'chirala' and credit card as '605385697632' and month as 'nov' and year as '2022' and click on purchase order 
	Then It should display a popup message as 'Thank you for your purchase!' 
	
Scenario: Blank name or Credit card 
	When I enter Blank name as '' and country as 'India' and city as 'chirala' and credit card as '' and month as 'nov' and year as '2022' and click on purchase order 
	Then It should display a error popup message as 'Please fill out Name and Creditcard.' 
	
Scenario: Filling all the details and click on close 
	When I enter name as 'hema' and Country as 'India' and city as 'chirala' and credit card as '605385697632' and month as 'nov' and year as '2022' and click on purchase order and click on close 
	Then It should go back to the cartpage and assert for 'Place Order' 
	
	
Scenario: Filling all details for purchase and click on OK 
	When I enter Name as 'hema' and country as 'India' and city as 'chirala' and credit card as '605385697632' and month as 'nov' and year as '2022' and click on purchase order and click on ok 
	Then It should navigate to 'PRODUCT STORE' page 
	
	
	
	

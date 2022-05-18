Feature: Add item to cart

Scenario Outline: search a product and add it to cart and verify it
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	And Click on Profile icon
	Then Click on login
	Then Enter email and password for valid login
	And Submit login
	Then Type <search> in the search box
	And Click on search
	Then Click on First Product
	And Click on add to cart
	And Verify the product name contains <search> is added or not to cart
	Then terminate the browser
	
	Examples:
	|search|
	|Sofa|
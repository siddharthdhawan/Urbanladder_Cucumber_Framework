Feature: Check emi options

Scenario Outline: search a product and check emi options available or not and very it
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	Then Type <search> in the search box
	And Click on search
	Then Click on First Product
	And Click on know more under emi option
	Then verify the pop up title is "Easy Finance Options" or not
	Then terminate the browser
	
	Examples:
	|search|
	|Sofa|
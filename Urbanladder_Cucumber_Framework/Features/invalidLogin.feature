Feature: Valid Login

Scenario: Use Valid data to login
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	And Click on Profile icon
	Then Click on login
	Then Enter email and password for invalid login
	And Submit login
	Then verify error message
	Then terminate the browser
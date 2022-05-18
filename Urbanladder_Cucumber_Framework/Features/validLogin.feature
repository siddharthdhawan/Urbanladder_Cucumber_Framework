Feature: Valid Login

Scenario: Use Valid data to login
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	And Click on Profile icon
	Then Click on login
	Then Enter email and password for valid login
	And Submit login
	Then Click on Profile icon
	And Click on profile
	And verify the mail is same as login mail
	Then terminate the browser
Feature: Invalid signup

Scenario: Giving invalid data and trying signup
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	And Click on Profile icon
	Then Click on sign up
	Then Enter email and password for invalid signup
	And Submit signup details
	Then verify error message for invalid signup
	Then terminate the browser
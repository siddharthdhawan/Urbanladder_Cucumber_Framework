Feature: Find a store

Scenario: Go to store section and verify the store location
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	Then Click on stores
	Then Click on a Delhi store
	And Verify the store location contains "Delhi" or not
	Then terminate the browser
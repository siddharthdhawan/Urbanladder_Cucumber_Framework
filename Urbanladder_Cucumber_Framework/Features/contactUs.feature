Feature: Contact us

Scenario: Go to contact us page and verify the heading of the page
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	Then Click on contact us under footer section
	And Verify that page heading is "Contact us" or not
	Then terminate the browser
Feature: Contact us

Scenario: Go to contact us page and verify the heading of the page
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	Then Click on warranty,return and refund under footer section
	And Verify that page contains two heading "warranty policy" and "RETURN AND REFUND" or not
	Then terminate the browser
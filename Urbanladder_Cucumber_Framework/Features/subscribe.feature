Feature: Subscribe for latest offers

Scenario: type email in subscribe input box and click subscribe
	Given Intialize the browser with chrome
	And Navigate to "https://www.urbanladder.com/"
	Then Type mail in subscriber input box
	And Click on subscriber
	Then verify the message "Thanks for subscribing!"
	Then terminate the browser
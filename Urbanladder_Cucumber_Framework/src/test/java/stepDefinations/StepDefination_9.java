package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.ContactUsPage;
import pageObject.HomePage;
import utility.SnapShots;

public class StepDefination_9 {

	HomePage homepage=new HomePage();
	ContactUsPage contactuspage=new ContactUsPage();
	SnapShots snap;
	
	@Then("^Click on contact us under footer section$")
	public void click_on_contact_us_under_footer_section() {
	    homepage.clickOnContactUs();
	}

	@And("^Verify that page heading is \"([^\"]*)\" or not$")
	public void verify_that_page_heading_is_or_not(String arg1) {
		snap=new SnapShots();
		String heading=contactuspage.getTitle();
		if(heading.equalsIgnoreCase(arg1)) {
			snap.takeSnapShot("Test 9 passed");
		} else {
			snap.takeSnapShot("Test 9 failed");
		}
	}

}

package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.HomePage;
import pageObject.SearchPage;
import utility.SnapShots;

public class StepDefination_7 {

	HomePage homepage=new HomePage();
	SearchPage searchpage=new SearchPage();
	SnapShots snap;
	
	@And("^Click on know more under emi option$")
	public void click_on_know_more_under_emi_option() {
	    searchpage.closePop();
	    searchpage.clickOnEmiKnowMore();
	}

	@Then("^verify the pop up title is \"([^\"]*)\" or not$")
	public void verify_the_pop_up_title_is_or_not(String arg1) {
		snap=new SnapShots();
		 String head=searchpage.getEmiOptionHeading();
			if(head.equalsIgnoreCase(arg1)) {
				snap.takeSnapShot("Test 7 passed");
			} else {
				snap.takeSnapShot("Test 7 failed");
			}
	}
}

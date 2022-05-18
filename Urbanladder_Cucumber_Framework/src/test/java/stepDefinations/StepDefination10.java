package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.HomePage;
import pageObject.WarrantyReturnPage;
import utility.SnapShots;

public class StepDefination10 {

	HomePage homepage=new HomePage();
	WarrantyReturnPage warrantyreturnpage=new WarrantyReturnPage();
	SnapShots snap;
	
	@Then("^Click on warranty,return and refund under footer section$")
	public void click_on_warranty_return_and_refund_under_footer_section() {
	    homepage.clickOnWarrantyReturnRefund();
	}

	@And("^Verify that page contains two heading \"([^\"]*)\" and \"([^\"]*)\" or not$")
	public void verify_that_page_contains_two_heading_and_or_not(String arg1, String arg2) {
		snap=new SnapShots();
		String warranty=warrantyreturnpage.getTitleWarrantyPolicy();
		String refund=warrantyreturnpage.getTitleReturnRefundPolicy();
		if(warranty.equalsIgnoreCase(arg1) && refund.contains(arg2)) {
			snap.takeSnapShot("Test 10 passed");
		} else {
			snap.takeSnapShot("Test 10 failed");
		}
	}
}

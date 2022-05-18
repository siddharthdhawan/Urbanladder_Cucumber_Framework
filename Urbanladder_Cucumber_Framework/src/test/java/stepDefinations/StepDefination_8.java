package stepDefinations;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pageObject.HomePage;
import pageObject.StorePage;
import utility.SnapShots;

public class StepDefination_8 {

	HomePage homepage=new HomePage();
	StorePage storepage=new StorePage();
	SnapShots snap;
	
	@Then("^Click on stores$")
	public void click_on_stores() {
	    homepage.clickOnStores();
	}

	@Then("^Click on a Delhi store$")
	public void click_on_a_Delhi_store() throws Throwable {
	    storepage.clickOnDelhiStore();
	}

	@And("^Verify the store location contains \"([^\"]*)\" or not$")
	public void verify_the_store_location_contains_or_not(String arg1) {
		snap=new SnapShots();
		String store=storepage.getStoreLocation();
		if(store.contains(arg1)) {
			snap.takeSnapShot("Test 8 passed");
		} else {
			snap.takeSnapShot("Test 8 failed");
		}
	}

}

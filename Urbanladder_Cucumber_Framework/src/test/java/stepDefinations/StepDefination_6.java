package stepDefinations;

import cucumber.api.java.en.Then;
import pageObject.CartPage;
import pageObject.HomePage;
import pageObject.SearchPage;
import utility.ConfigRead;
import utility.SnapShots;

public class StepDefination_6 {

	ConfigRead cr=new ConfigRead();
	HomePage homepage=new HomePage();
	SearchPage searchpage=new SearchPage();
	CartPage cartpage=new CartPage();
	SnapShots snap;
	
	@Then("^Click on add to cart$")
	public void click_on_add_to_cart() {
	    searchpage.clickOnAddToCart();
	}

	@Then("^Verify the product name contains (.+) is added or not to cart$")
	public void verify_the_product_name_contains_is_added_or_not_to_cart(String search) throws Throwable {
		snap=new SnapShots();
		String cartItem=cartpage.getCartItem();
		if(cartItem.contains(search)) {
			snap.takeSnapShot("Test 6 passed");
		} else {
			snap.takeSnapShot("Test 6 failed");
		}
	}
}

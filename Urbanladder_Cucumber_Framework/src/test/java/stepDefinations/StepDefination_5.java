package stepDefinations;

import cucumber.api.java.en.*;
import pageObject.HomePage;
import pageObject.SearchPage;
import pageObject.WishlistPage;
import utility.ConfigRead;
import utility.SnapShots;

public class StepDefination_5 {
	
	ConfigRead cr=new ConfigRead();
	HomePage homepage=new HomePage();
	SearchPage searchpage=new SearchPage();
	WishlistPage wishlistpage=new WishlistPage();
	SnapShots snap;
	
	@Then("^Type (.+) in the search box$")
	public void type_in_the_search_box(String search) {
		homepage.typeSearch(search);
	}
	

	@Then("^Click on search$")
	public void click_on_search() {
	    homepage.clickOnSearch();
	}

	@Then("^Click on First Product$")
	public void click_on_First_Product() {
	    searchpage.clickOnResult1();
	}

	@Then("^Click on wishlist icon$")
	public void click_on_wishlist_icon() {
	   searchpage.clickOnWhishlist();
	}

	@Then("^Goto my wishlist$")
	public void goto_my_wishlist() {
	    searchpage.clickOnCheckWhishlist();
	}

	@Then("^verify the product name contains (.+) is added or not to wishlist$")
	public void verify_the_product_name_contains_is_added_or_not_to_wishlist(String search) {
		snap=new SnapShots();
		String item=wishlistpage.getItemName();
		if(item.contains(search)) {
			snap.takeSnapShot("Test 5 passed");
		} else {
			snap.takeSnapShot("Test 5 failed");
		}
	}
}

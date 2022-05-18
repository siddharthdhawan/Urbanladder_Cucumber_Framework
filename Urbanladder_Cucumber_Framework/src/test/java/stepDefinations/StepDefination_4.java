package stepDefinations;

import java.io.IOException;

import cucumber.api.java.en.Then;
import pageObject.HomePage;
import utility.ConfigRead;
import utility.ReadExcel;
import utility.SnapShots;

public class StepDefination_4 {
	
	ConfigRead cr=new ConfigRead();
	HomePage homepage=new HomePage();
	SnapShots snap;
	
	@Then("^Type mail in subscriber input box$")
	public void type_mail_in_subscriber_input_box() throws IOException {
	  String mailId=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 0);
	  homepage.typeSubscribeMailId(mailId);
	}

	@Then("^Click on subscriber$")
	public void click_on_subscriber() {
	    homepage.clickOnSubscribe();
	}

	@Then("^verify the message \"([^\"]*)\"$")
	public void verify_the_message(String arg1) {
	    snap=new SnapShots();
	    String msg=homepage.getSubscribedMsg();
		if(msg.equalsIgnoreCase("Thanks for subscribing!")) {
			snap.takeSnapShot("Test 4 passed");
		} else {
			snap.takeSnapShot("Test 4 failed");
		}
	}

}

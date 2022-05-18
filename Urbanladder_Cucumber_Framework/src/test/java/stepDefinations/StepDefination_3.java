package stepDefinations;

import java.io.IOException;

import cucumber.api.java.en.Then;
import pageObject.HomePage;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ReadExcel;
import utility.SnapShots;

public class StepDefination_3 {

	ConfigRead cr=new ConfigRead();
	BaseClass baseclass=new BaseClass();
	HomePage homepage=new HomePage();
	SnapShots snap;
	
	@Then("^Click on sign up$")
	public void click_on_sign_up() {
	    homepage.clickOnSignUp();
	}
	
	@Then("^Enter email and password for invalid signup$")
	public void enter_email_and_password_for_invalid_signup() throws IOException {
	   String email=ReadExcel.getValidStringData(cr.Excel3Filepath(), 1, 0);
	   homepage.typeSignUpMail(email);
	   String password=ReadExcel.getValidStringData(cr.Excel3Filepath(), 1, 1);
	   homepage.typeSignUpPw(password);
	}
	@Then("^Submit signup details$")
	public void submit_signup_details() {
	   homepage.submitSignUp();;
	}

	@Then("^verify error message for invalid signup$")
	public void verify_error_message_for_invalid_signup() {
		snap=new SnapShots();
	   String text=homepage.getErrorSignUpMail();
	   if(text.equalsIgnoreCase("please enter a valid email address.")) {
			snap.takeSnapShot("Test 3 passed");
		} else {
			snap.takeSnapShot("Test 3 failed");
		}
	}
}

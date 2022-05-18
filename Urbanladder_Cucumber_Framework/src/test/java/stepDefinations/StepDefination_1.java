package stepDefinations;

import java.io.IOException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject.HomePage;
import pageObject.MyProfilePage;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ReadExcel;
import utility.SnapShots;

public class StepDefination_1 extends BaseClass {

	ConfigRead cr=new ConfigRead();
	BaseClass baseclass=new BaseClass();
	HomePage homepage=new HomePage();
	MyProfilePage myprofilepage=new MyProfilePage();
	SnapShots snap;
	
	
	@Given("^Intialize the browser with chrome$")
	public void intialize_the_browser_with_chrome() {
		baseclass.setup();
	}

	@Given("^Navigate to \"([^\"]*)\"$")
	public void navigate_to(String arg1) {
		driver.get(arg1);
	}
	
	@Given("^Click on Profile icon$")
	public void click_on_Profile_icon() {
	    homepage.clickOnProfile();
	}
	
	
	@Then("^Click on login$")
	public void click_on_login() {
	    homepage.clickOnLogin();
	}

	@Then("^Enter email and password for valid login$")
	public void enter_email_and_password_for_valid_login() throws IOException {
	    String email=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 0);
	    homepage.typeLoginMail(email);
	    String password=ReadExcel.getValidStringData(cr.Excel1Filepath(), 1, 1);
	    homepage.typeLoginPw(password);
	}

	@Then("^Submit login$")
	public void Submit_login() {
		homepage.submitLogin();
	}
	
	@And("^Click on profile$")
	public void click_on_profile() throws Throwable {
	    homepage.clickOnMyProfile();
	}


	@Then("^verify the mail is same as login mail$")
	public void verify_the_mail_is_same_as_login_mail() throws IOException  {
		snap=new SnapShots();
		 String expectedMail=ReadExcel.getValidStringData(cr.Excel3Filepath(), 1, 0);
		 String actualMail=myprofilepage.getMail();
		 if(expectedMail.equalsIgnoreCase(actualMail)) {
			 snap.takeSnapShot("Test 1 passed");
		  } else {
			  snap.takeSnapShot("Test 1 passed");
		  }
	}
	
	@Then("^terminate the browser$")
	public void terminate_the_browser() {
	    baseclass.teardown();
	}
}

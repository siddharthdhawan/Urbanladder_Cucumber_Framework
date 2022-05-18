package stepDefinations;

import java.io.IOException;

import cucumber.api.java.en.Then;
import pageObject.ErrorLoginPage;
import pageObject.HomePage;
import pageObject.MyProfilePage;
import utility.BaseClass;
import utility.ConfigRead;
import utility.ReadExcel;
import utility.SnapShots;

public class StepDefination_2 {

	ConfigRead cr=new ConfigRead();
	BaseClass baseclass=new BaseClass();
	HomePage homepage=new HomePage();
	MyProfilePage myprofilepage=new MyProfilePage();
	ErrorLoginPage errorloginpage=new ErrorLoginPage();
	SnapShots snap;
	
	@Then("^Enter email and password for invalid login$")
	public void enter_email_and_password_for_invalid_login() throws IOException {
	    String email=ReadExcel.getValidStringData(cr.Excel2Filepath(), 1, 0);
	    homepage.typeLoginMail(email);
	    String password=ReadExcel.getValidStringData(cr.Excel2Filepath(), 1, 1);
	    homepage.typeLoginPw(password);
	}
	
	@Then("^verify error message$")
	public void verify_error_message() {
		snap=new SnapShots();
		String msg=errorloginpage.getErrorMsg();
		if(msg.contains("incorrect")) {
			snap.takeSnapShot("Test 2 passed");
		} else {
			snap.takeSnapShot("Test 2 failed");
		}
	}
}

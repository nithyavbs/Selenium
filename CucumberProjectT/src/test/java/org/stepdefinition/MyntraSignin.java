package org.stepdefinition;

import com.base.BaseClass;
import com.sample.MyntraLoginPojo;

import cucumber.api.java.en.When;

public class MyntraSignin extends BaseClass {

	MyntraLoginPojo mp;
	@When("To launch the url of the myntra application")
	public void to_launch_the_url_of_the_myntra_application() {
		mp=new MyntraLoginPojo();
	launchUrl("https://www.myntra.com/login?referer=https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=Cj0KCQiA_P6dBhD1ARIsAAGI7HACMZP7lPQtiR14L28dnubaviglHsjkGrwbS1d8vU90tkyl7jdaITcaAmZIEALw_wcB");
	}

	@When("To pass valid mobileno in mobilenumber field")
	public void to_pass_valid_mobileno_in_mobilenumber_field() {
		mp=new MyntraLoginPojo();
	passText("7708443003", mp.getMobileno());
	}

	@When("To click the continue button to get otp")
	public void to_click_the_continue_button_to_get_otp() throws InterruptedException {
		Thread.sleep(3000);
		mp= new MyntraLoginPojo();
		clickBtn(mp.geOtp());
	}
}

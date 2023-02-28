package org.stepdefinition;

import com.base.BaseClass;
import com.sample.IciciLoginPojo;

import cucumber.api.java.en.When;

public class IciciLogin extends BaseClass{

	IciciLoginPojo ip;
	@When("To launch the url of the icici login application")
	public void to_launch_the_url_of_the_icici_login_application() {
		launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		
	}

	@When("To pass valid username in userId field")
	public void to_pass_valid_username_in_userId_field() {
		ip=new IciciLoginPojo();
		passText("kavi_up",ip.getUserId());
	}
	
	@When("To check valid userId or not")
	public void to_check_valid_userId_or_not() {
		ip=new IciciLoginPojo();
		clickBtn(ip.getArrow());
	}

	@When("To pass valid password in password field")
	public void to_pass_valid_password_in_password_field() throws InterruptedException {
		Thread.sleep(3000);
		ip=new IciciLoginPojo();
		passText("673416",ip.getPwd());
	}

	@When("To check whether navigate to the validate page or not")
	public void to_check_whether_navigate_to_the_validate_page_or_not() {
		ip=new IciciLoginPojo();
		clickBtn(ip.getLoginBtn());

	}
}

package org.stepdefinition;

import java.util.List;
import java.util.Map;

import com.base.BaseClass;
import com.sample.AmazonLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonSignin extends BaseClass{
	AmazonLoginPojo ap;
	
	@Given("To launch chrome browser and maximize window")
	public void to_launch_chrome_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of the amazon application")
	public void to_launch_the_url_of_the_amazon_application() {
		launchUrl("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fs%3Fk%3Damazon%2Bsign%26i%3Delectronics%26adgrpid%3D59527504272%26ext_vrnc%3Dhi%26gclid%3DCj0KCQiA_P6dBhD1ARIsAAGI7HDdTjWp918JrlUz1UosDu0S5f2kStZHTmNtbhBYI4tCaEyyHqeLV7UaAnR5EALw_wcB%26hvadid%3D596980891918%26hvdev%3Dc%26hvlocphy%3D1007810%26hvnetw%3Dg%26hvqmt%3Db%26hvrand%3D11440065618350695016%26hvtargid%3Dkwd-365111317397%26hydadcr%3D19941_2255885%26tag%3Dgooginhydr1-21%26ref%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	}
	@When("To pass valid email or mobileno in email field")
	public void to_pass_valid_email_or_mobileno_in_email_field(DataTable d) {
		Map<String,String> map = d.asMap(String.class,String.class);
		ap=new AmazonLoginPojo();
		passText(map.get("email1"),ap.getEmailOrMob());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() {
		ap=new AmazonLoginPojo();
		clickBtn(ap.getContBtn());
	}

//	@When("To check whether navigate to the validate page or not")
//	public void to_check_whether_navigate_to_the_validate_page_or_not(DataTable d) throws InterruptedException {
//		Thread.sleep(3000);
//		List<Map<String, String>> maps = d.asMaps();
////		Map<String,String> map = d.asMap(String.class,String.class);
//		ap=new AmazonLoginPojo();
//		passText(maps.get(0).get("password1"),ap.getPwd());
//	}

	@Then("To close the browser")
	public void to_close_the_browser() {
//		closeEntireBrowser();
	}
}

package org.stepdefinition;

import java.util.List;

import com.base.BaseClass;
import com.sample.FbRegisterPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class FbRegister extends BaseClass {
	FbRegisterPojo fp;
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
		launchBrowser();
		windowMaximize();
			    
	}
	@When("To launch the fb url of the fb application")
	public void to_launch_the_fb_url_of_the_fb_application() {
		launchUrl("https://en-gb.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() {
		fp=new FbRegisterPojo();
		clickBtn(fp.getCreateAcc());
				}

	@When("To pass firstname in firstname field")
	public void to_pass_firstname_in_firstname_field(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> l = d.asList();
		fp=new FbRegisterPojo();
		passText(l.get(1), fp.getFirstNameTextBox());
	}

	@When("To pass surname in surname field")
	public void to_pass_surname_in_surname_field() {
		fp=new FbRegisterPojo();
		passText("vbs", fp.getSurNameTextBox());
	}

	@When("To pass mobileno or email in email text field")
	public void to_pass_mobileno_or_email_in_email_text_field(DataTable d) {
		List<List<String>> l = d.asLists();
		fp=new FbRegisterPojo();
		passText(l.get(1).get(1), fp.getMobileorEmailTextBox());
	}

	@When("To create new password using new password text box")
	public void to_create_new_password_using_new_password_text_box() {
		fp=new FbRegisterPojo();
		passText("12345", fp.getNewPassword());
	}
	
	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	   // closeEntireBrowser();
	}


}

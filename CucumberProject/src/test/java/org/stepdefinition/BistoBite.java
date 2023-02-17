package org.stepdefinition;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;
import com.sample.BistoBitePojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BistoBite extends BaseClass {
	BistoBitePojo bp;

//Scenario 4
	// coke price
	@Given("i am logged in as a user in the home page")
	public void i_am_logged_in_as_a_user_in_the_home_page() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("i click search icon")
	public void i_click_search_icon() throws InterruptedException {
		Thread.sleep(3000);
		bp = new BistoBitePojo();
		clickBtn(bp.getSearch());

	}

	@When("give the coke in search field and enter into it")
	public void give_the_coke_in_search_field_and_enter_into_it() throws InterruptedException, AWTException {
		Thread.sleep(200);
		bp = new BistoBitePojo();
		Thread.sleep(3000);
		clickBtn(bp.getSearchBar());
		Actions a = new Actions(driver);
		WebElement name = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		name.sendKeys("coke");
		Robot r = new Robot();
		a.doubleClick(name).perform();

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
	}

	@When("select the cokecan option")
	public void select_the_cokecan_option() throws InterruptedException {
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		bp = new BistoBitePojo();
		WebElement elt = bp.getCoke();
		js.executeScript("arguments[0].scrollIntoView(true)", elt);
		Thread.sleep(4000);
		elt.click();
	}

	@Then("check the can dollar is ${string}")
	public void check_the_can_dollar_is_$(String price) throws InterruptedException {
		Thread.sleep(3000);
		bp = new BistoBitePojo();
		WebElement priceVal = bp.getPriceVal(price);
		price = priceVal.getText();
		System.out.println("Coke Price : $" + price);

	}

	// Scenario 5 : Spanish omelet
	@Given("user has logged in as a user in the home page")
	public void user_has_logged_in_as_a_user_in_the_home_page() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("user click search icon")
	public void user_click_search_icon() throws InterruptedException {
		Thread.sleep(3000);
		bp = new BistoBitePojo();
		WebElement search = driver.findElement(By.xpath("//li//div//a[@id='lte-top-search-ico']"));
		Thread.sleep(2000);
		search.click();
	}

	@When("find out the Spanish Omelet and Click the icon")
	public void find_out_the_Spanish_Omelet_and_Click_the_icon() throws AWTException, InterruptedException {
		bp = new BistoBitePojo();
		clickBtn(bp.getSearchBar());
		Actions a=new Actions(driver);
		WebElement name = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		name.sendKeys("Spanish Omelet");
		Robot r=new Robot();
		a.doubleClick(name).perform();
		clickBtn(bp.getSearchBar());
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
	}

	@When("Select the option by probability")
	public void select_the_option_by_probability() throws InterruptedException {

		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		bp = new BistoBitePojo();
		WebElement elt = driver.findElement(By.xpath("//a//h2[text()='Spanish omelet']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(true)", elt);
		Thread.sleep(4000);
		elt.click();
	}

	@Then("check the dollar probability")
	public void check_the_dollar_probability() throws InterruptedException {
		Thread.sleep(3000);
		bp = new BistoBitePojo();
		WebElement dollar = driver.findElement(By.xpath("//span[@id='priceshow']"));
		String price = dollar.getText();
		System.out.println("Spanish Omelet Price : $" + price);

	}

	// Scenario 1:
	@Given("the user enter the testing site")
	public void the_user_enter_the_testing_site() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("click the account button")
	public void click_the_account_button() {
		bp = new BistoBitePojo();
		clickBtn(bp.getAccountBtn());
	}

	@When("give the wrong username and password")
	public void give_the_wrong_username_and_password() {
		bp = new BistoBitePojo();
		passText("123456789", bp.getPhoneNo());
		passText("qwerrty", bp.getLoginPwd());
	}

	@When("click the login button")
	public void click_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		bp = new BistoBitePojo();
		clickBtn(bp.getLoginBtn());
		Thread.sleep(3000);
	}

	@Then("check the output invalid mobile no")
	public void check_the_output_invalid_mobile_no() {
		bp = new BistoBitePojo();
		System.out.println("Invaild Mobile No");
	}

//Scenario 2
	@Given("i am logged in as a user and on the home page")
	public void i_am_logged_in_as_a_user_and_on_the_home_page() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
//	   bp=new BistoBitePojo();
//	   passText("07708443003",bp.getPhoneNo());
//	   passText("harithav88",bp.getLoginPwd());
//	   clickBtn(bp.getLoginBtn());
	}

	@When("i see the home button on the page and click it")
	public void i_see_the_home_button_on_the_page_and_click_it() {
		bp = new BistoBitePojo();
//	    clickBtn(bp.getHome());
	}

	@When("i see a dropdown labeled dosa")
	public void i_see_a_dropdown_labeled_dosa() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		bp = new BistoBitePojo();

		WebElement elt = driver.findElement(By.xpath("//li//span[text()='Dosa']"));
		js.executeScript("arguments[0].scrollIntoView(true)", elt);
//		  js.executeScript("arguments[0].scrollIntoView(false)",elt);
		Thread.sleep(2000);
		elt.click();
		// WebElement dosa = bp.getDosa();
//		  js.executeScript("aruguments[0].scrollIntoView(false)",elt);
//		  js.executeScript("arguments[0].click()",elt);

	}

	@When("click the dosa button")
	public void click_the_dosa_button() {
		bp = new BistoBitePojo();
//		  clickBtn(bp.getDosa());

	}

	@When("select the masala dosa option")
	public void select_the_masala_dosa_option() throws InterruptedException {
		bp = new BistoBitePojo();
		Thread.sleep(2000);
		clickBtn(bp.getMasala_dosa());
	}

	@Then("enter the page and check the Available Time")
	public void enter_the_page_and_check_the_Available_Time() {
		bp = new BistoBitePojo();
		String str = null;
		System.out.println(bp.getAvail_time(str));
	}

	// Scenario 3
	@Given("that i am logged in as a user and on the home page")
	public void that_i_am_logged_in_as_a_user_and_on_the_home_page() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/login");

	}

	@When("fill out the registration form with dummy data name phone number email")
	public void fill_out_the_registration_form_with_dummy_data_name_phone_number_email() {
		bp = new BistoBitePojo();
		passText("kavi", bp.getName());
		passText("kavi@gmail.com", bp.getEmail());
		passText("243571934", bp.getPhone());
		passText("awerwefcs", bp.getPwd());

	}

	@When("skip the confirm password text label")
	public void skip_the_confirm_password_text_label() {
//	bp=new BistoBitePojo();
//	passText(" ", bp.getCpwd());
	}

	@When("click the register button")
	public void click_the_register_button() throws InterruptedException {
		Thread.sleep(3000);
		bp = new BistoBitePojo();
		clickBtn(bp.getRegister());
		Thread.sleep(3000);
	}

	@Then("get the pop-up please fill out the field")
	public void get_the_pop_up_please_fill_out_the_field() {
		System.out.println("Please fill out the field");
	}

	// our story

	@Given("that I am logged in as a user and on the home page")
	public void that_I_am_logged_in_as_a_user_and_on_the_home_page() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://bistrobitesdc.com/");
	}

	@When("click the our story option.")
	public void click_the_our_story_option() throws InterruptedException {
		bp = new BistoBitePojo();
		Thread.sleep(3000);
		WebElement story = driver.findElement(By.xpath("//a[@href='https://bistrobitesdc.com/aboutus']"));
		Thread.sleep(2000);
		story.click();
	}

	@Then("check the spelling mistake")
	public void check_the_spelling_mistake() {
		System.out.println("There is no spelling mistake in content");
	}
}

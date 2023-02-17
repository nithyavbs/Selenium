package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BistoBitePojo extends BaseClass {
	public BistoBitePojo() {
		PageFactory.initElements(driver, this);
	}

	// login
	@FindBy(xpath = "(//div//ul//li//a//span[normalize-space(text()='Account')])[24]")
	private WebElement accountBtn;

	@FindBy(xpath = "(//input[@id='phone'])[1]")
	private WebElement phoneNo;

	@FindBy(xpath = "//input[@id='password']")
	private WebElement loginPwd;

	@FindBy(xpath = "(//button[@name='login'])[1]")
	private WebElement loginBtn;

	public WebElement getAccountBtn() {
		return accountBtn;
	}

	public WebElement getPhoneNo() {
		return phoneNo;
	}

	public WebElement getLoginPwd() {
		return loginPwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	// Adding_dosa
	@FindBy(xpath = "//div//ul//li//a//span//span[text()='Home']")
	private WebElement home;

	@FindBy(xpath = "//a//h6[text()='Dosa']")
	private WebElement dosa;

	@FindBy(xpath = "//div//a//h2[text()='Masala Dosa']")
	private WebElement masala_dosa;

	@FindBy(xpath = "(//span[text()='Available at 08:00 AM'])[1]")
	private WebElement avail_time;

	public WebElement getHome() {
		return home;
	}

	public WebElement getDosa() {
		return dosa;
	}

	public WebElement getMasala_dosa() {
		return masala_dosa;
	}

	public String getAvail_time(String avail) {
		avail = avail_time.getText();
		return avail;
	}

	// Registration
	@FindBy(id = "name")
	private WebElement name;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(xpath = "(//input[@id='phone'])[2]")
	private WebElement phone;

	@FindBy(xpath = "//input[@id='password_reg']")
	private WebElement pwd;

	@FindBy(xpath = "//input[@id='con_password_reg']")
	private WebElement cpwd;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement register;

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getCpwd() {
		return cpwd;
	}

	public WebElement getRegister() {
		return register;
	}

	// ---------------coke search-------

	@FindBy(xpath = "//div//a[@id='lte-top-search-ico']")
	WebElement search;
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	WebElement searchBox;

	@FindBy(xpath = "//div//a//h2[text()='Coke Can 12oz']")
	WebElement coke;

	@FindBy(xpath = "//p//span//span[text()=' 1.50 ']")
	WebElement priceVal;

	public WebElement getAvail_time() {
		return avail_time;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getSearchBar() {
		return searchBox;
	}

	public WebElement getCoke() {
		return coke;
	}

	public WebElement getPriceVal(String price) {
		price = priceVal.getText();
		return priceVal;
	}

	

}

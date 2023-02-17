package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class AmazonLoginPojo extends BaseClass {

	public AmazonLoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ap_email")
	private WebElement emailOrMob;

	@FindBy(id = "continue")
	private WebElement contBtn;

	@FindBy(name = "password")
	private WebElement pwd;

	@FindBy(id = "signInSubmit")
	private WebElement signBtn;

	public WebElement getEmailOrMob() {
		return emailOrMob;
	}

	public WebElement getContBtn() {
		return contBtn;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSignBtn() {
		return signBtn;
	}

}

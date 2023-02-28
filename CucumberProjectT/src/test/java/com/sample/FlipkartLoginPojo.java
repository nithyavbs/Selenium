package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FlipkartLoginPojo extends BaseClass {

	public FlipkartLoginPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement email;
	
	@FindBy(xpath="//button[text()='Request OTP']")
	private WebElement otp;
	
	
	public WebElement getEmail() {
		return email;
	}
	public WebElement getOtp() {
		return otp;
	}

	}

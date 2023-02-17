package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MyntraLoginPojo extends BaseClass {

	public MyntraLoginPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement mobileno;
	
	@FindBy(xpath="//div[text()='CONTINUE']")
	private WebElement Otp;
	
	
	public WebElement getMobileno() {
		return mobileno;
	}
	public WebElement geOtp() {
		return Otp;
	}

}

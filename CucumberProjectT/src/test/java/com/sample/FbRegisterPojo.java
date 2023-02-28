package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class FbRegisterPojo extends BaseClass{
	public FbRegisterPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Create New Account']")
	private WebElement createAcc;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement fNameTextBox;
	
	@FindBy(name="lastname")
	private WebElement sNameTextBox;
	
	@FindBy(name="reg_email__")
	private WebElement mobileorEmailTextBox;
	
	@FindBy(name="reg_passwd__")
	private WebElement newPassword;

	public WebElement getCreateAcc() {
		return createAcc;
	}

	public WebElement getFirstNameTextBox() {
		return fNameTextBox;
	}

	public WebElement getSurNameTextBox() {
		return sNameTextBox;
	}

	public WebElement getMobileorEmailTextBox() {
		return mobileorEmailTextBox;
	}

	public WebElement getNewPassword() {
		return newPassword;
	}
	

}

package com.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class GmailLoginPojo extends BaseClass {
	 
	 public GmailLoginPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="(//button[@jsname='LgbsSe'])[2]")
	private WebElement next;
	
	@FindBy(name="Passwd")
	private WebElement pwd;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPwd() {
		return pwd;
	}
}

package com.sample;

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
	
	@FindBy(xpath="(//div//span[@jsname='V67aGc'])[2]")

	private WebElement loginNext;
	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}

	public WebElement getPwd() {
		return pwd;
	}
	
	public WebElement getLogin() {
		return loginNext;
	}
}

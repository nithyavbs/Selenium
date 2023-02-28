package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class IciciLoginPojo extends BaseClass{

	public IciciLoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="DUMMY1")
	private WebElement userId;
	
	@FindBy(id="HDisplayDefault.Rb14.C3")
	private WebElement arrow;
	
	@FindBy(id="AuthenticationFG.ACCESS_CODE")
	private WebElement pwd;
	
	@FindBy(id="VALIDATE_CREDENTIALS1")
	private WebElement loginBtn;

	public WebElement getUserId() {
		return userId;
	}
	public WebElement getArrow() {
		return arrow;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	
	
	
	
	
}

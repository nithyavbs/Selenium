package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBusPojo extends BaseClass {
	public RedBusPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='src']")
	private WebElement src;
	
	@FindBy(xpath="//input[@id='dest']")
	private WebElement dest;
	
	@FindBy(xpath="//input[@id='onward_cal']")
	private WebElement date;
	
	@FindBy(xpath="//button[text()='Search Buses']")
	private WebElement searchBtn;

	public WebElement getSrc() {
		return src;
	}

	public WebElement getDest() {
		return dest;
	}

	public WebElement getDate() {
		return date;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	
}

package com.sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class MyntraPojo extends BaseClass {

	public MyntraPojo(){
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	private WebElement search;
	
	@FindBy(xpath="//a//span[@data-reactid='909']")
	private WebElement searchIcon;
	@FindBy(xpath="(//img[@class='img-responsive'])[1]")
	private WebElement firstImg;
	
	public WebElement getFirstImg() {
		return firstImg;
	}
	@FindBy(xpath="//div//div//div//div//button//p[text()='M']")
	private WebElement mSizeBtn;
	
	@FindBy(xpath="//div//span[@class='myntraweb-sprite pdp-whiteBag sprites-whiteBag pdp-flex pdp-center']")
	private WebElement addToBag;
	@FindBy(xpath="//button[text()='ADD TO BAG']")
	private WebElement addBag;
	
	public WebElement getAddToBag() {
		return addToBag;
	}
	@FindBy(xpath="//a//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
	private WebElement bagIcon;
	
	
	public WebElement getSearch() {
		return search;
	}
	public WebElement getSearchIcon() {
		return searchIcon;
	}
	public WebElement getmSizeBtn() {
		return mSizeBtn;
	}
	public WebElement getAddBag() {
		return addBag;
	}
	public WebElement getBagIcon() {
		return bagIcon;
	}
	
}

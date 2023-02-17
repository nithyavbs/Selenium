package com.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class DataProviderEx extends BaseClass  {
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
System.out.println("Launch Browser....");
	}
	@DataProvider(name="Amazon Items")
	private Object data() {
		return new Object[][] {
			{"Kurta"},
			{"sarees"}, {"Tshirts"}, {"Shirts"},{"Jean Pants"},	{"Kids Frocks"}
						
		};
	}
	@Test(dataProvider = "Amazon Items")
	private void tc1(String products) throws AWTException, InterruptedException {
		launchUrl("https://www.amazon.in/");
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys(products);
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
}

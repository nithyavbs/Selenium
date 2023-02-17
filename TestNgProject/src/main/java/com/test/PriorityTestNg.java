package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.base.BaseClass;

public class PriorityTestNg extends BaseClass{
	@Test(priority = -12)
	private void tc3() {
		launchUrl("https://accounts.google.com/AccountChooser/signinchooser?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AccountChooser");
		System.out.println("gmail");
	}
	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
System.out.println("Launch Browser....");
	}
	
	@Test(priority = -1)
	private void tc6() {
		launchUrl("https://www.redbus.in/");
		System.out.println("redbus");
	}
	@Test(priority = -7)
	private void tc2() {
		launchUrl("https://inmakes.com/");
		System.out.println("Inmakes");
	}
	@Test(priority = 5)
	private void tc7() {
		launchUrl("https://en-gb.facebook.com/");
		System.out.println("facebook");
	}
	@Test(priority = 2)
	private void tc1() {
		launchUrl("https://www.amazon.in/");
		System.out.println("amazon");
	}
	@Test(priority = 9)
	private void tc4() {
		launchUrl("https://www.youtube.com/");
		System.out.println("youtube");
	}
	@Test
	private void tc5() {
		launchUrl("https://www.flipkart.com/");
		System.out.println("flipkart");
	}
	@AfterClass
	private void closeTheBrowser() {
System.out.println("Browser CLosed!");
	}
	
}

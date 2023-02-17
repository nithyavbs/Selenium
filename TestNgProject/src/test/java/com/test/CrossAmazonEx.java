package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossAmazonEx {
@Parameters("browser")
@Test

private void tc1(String browserName) {
	WebDriver driver;
	
	if
	(browserName.equals("firefoxbrowser")){
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	else if(browserName.equals("chromebrowser")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	driver.manage().window().maximize();
//	driver.findElement(By.id("ap_email")).sendKeys("nithivbs@gmail.com");
	
}
}

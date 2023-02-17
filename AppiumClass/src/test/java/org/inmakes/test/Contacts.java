package org.inmakes.test;

import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class Contacts {
	public static AndroidDriver driver;

	@Test
	private void tc1() throws IOException , AWTException, MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		Properties property=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\kesarsoft\\eclipse-workspace\\AppiumClass\\Files\\config.properties");
		property.load(fis);
		cap.setCapability("platformName", property.getProperty("platformName"));
		cap.setCapability("platformVersion", property.getProperty("version"));
		cap.setCapability("deviceName", property.getProperty("name"));
		cap.setCapability("udid", property.getProperty("udid"));
		cap.setCapability("appPackage", property.getProperty("appPackage"));
		cap.setCapability("appActivity", property.getProperty("appActivity"));

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath(property.getProperty("add")));
		add.click();
		Thread.sleep(1000);
		WebElement firstName = driver.findElement(By.xpath(property.getProperty("firstname")));
		firstName.sendKeys(property.getProperty("phName"));
		Thread.sleep(1000);
		WebElement phNo = driver.findElement(By.xpath(property.getProperty("phone")));
		phNo.sendKeys(property.getProperty("phNumber"));
		Thread.sleep(1000);
		WebElement save = driver.findElement(By.xpath(property.getProperty("create")));
		save.click();
		
		
	}

}

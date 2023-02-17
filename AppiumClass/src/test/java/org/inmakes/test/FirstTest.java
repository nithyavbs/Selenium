package org.inmakes.test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FirstTest {

	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("deviceName", "realmex7max");
		cap.setCapability("udid", "OJKRX4NRGI95GEU8");
		cap.setCapability("appPackage", "com.coloros.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		
		WebElement nine= driver.findElement(By.id("com.coloros.calculator:id/digit_9"));
		nine.click();
		
		WebElement add=driver.findElement(By.id("com.coloros.calculator:id/op_add"));
		add.click();
		
		WebElement one=driver.findElement(By.id("com.coloros.calculator:id/digit_1"));
		one.click();
		
		WebElement equal=driver.findElement(By.id("com.coloros.calculator:id/eq"));
		equal.click();
				

	}

}

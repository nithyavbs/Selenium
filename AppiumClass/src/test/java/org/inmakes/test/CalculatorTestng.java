package org.inmakes.test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorTestng {

	public static AndroidDriver driver;

	@BeforeClass
	private void launchBrowser() throws InterruptedException, MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("deviceName", "realmex7max");
		cap.setCapability("udid", "OJKRX4NRGI95GEU8");
		cap.setCapability("appPackage", "com.coloros.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		Thread.sleep(3000);

	}
	@Test
	private void tc1() {
		WebElement two = driver.findElement(By.id("com.coloros.calculator:id/digit_2"));
		two.click();
		WebElement five = driver.findElement(By.id("com.coloros.calculator:id/digit_5"));
		five.click();
	}
	@Test
	private void tc2() {
		WebElement cross = driver.findElement(By.id("com.coloros.calculator:id/op_mul"));
		cross.click();
	}
	@Test
	private void tc3() {
		WebElement one = driver.findElement(By.id("com.coloros.calculator:id/digit_1"));
		one.click();
		WebElement zero = driver.findElement(By.id("com.coloros.calculator:id/digit_0"));
		zero.click();
	}
	@Test
	private void tc4() throws IOException {
		WebElement equal=driver.findElement(By.id("com.coloros.calculator:id/eq"));
		equal.click();
		TakesScreenshot ts=(TakesScreenshot)driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f=new File("./screenshot\\calc.png");
		FileUtils.copyFile(img, f);
	}

	@BeforeMethod
	private void startDate() {
		Date date = new Date();
		System.out.println(date);
	}

	@AfterMethod
	private void endDate() {
		Date d = new Date();
		System.out.println(d);
	}

	@AfterClass
	private void closeBrowser() {
		driver.quit();
	}
}

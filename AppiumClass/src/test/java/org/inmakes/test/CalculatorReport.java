package org.inmakes.test;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.appium.java_client.android.AndroidDriver;

public class CalculatorReport {
	public static AndroidDriver driver;

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test;

	@BeforeSuite
	private void tc1() throws IOException, AWTException, InterruptedException, MalformedURLException {
		htmlReporter = new ExtentHtmlReporter("calcreport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test=extent.createTest("Android","Calculator App");
		DesiredCapabilities cap = new DesiredCapabilities();
		Properties property = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\kesarsoft\\eclipse-workspace\\AppiumClass\\Files\\config.properties");
		property.load(fis);
		cap.setCapability("platformName", property.getProperty("platformName"));
		cap.setCapability("platformVersion", property.getProperty("version"));
		cap.setCapability("deviceName", property.getProperty("name"));
		cap.setCapability("udid", property.getProperty("udid"));
		cap.setCapability("appPackage", property.getProperty("package"));
		cap.setCapability("appActivity", property.getProperty("activity"));

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url, cap);
		Thread.sleep(3000);
		test.log(Status.INFO, "Appium click the number 2");
		WebElement two = driver.findElement(By.id(property.getProperty("no1")));
		two.click();
		test.log(Status.INFO, "Appium click the number 5");
		WebElement five = driver.findElement(By.id(property.getProperty("no2")));
		five.click();
		test.log(Status.INFO, "Appium click the multiply symbol");
		WebElement cross = driver.findElement(By.id(property.getProperty("mul")));
		cross.click();
		test.log(Status.INFO, "Appium click the number 3");
		WebElement one = driver.findElement(By.id(property.getProperty("no3")));
		one.click();
		test.log(Status.INFO, "Appium click the number 0");
		WebElement zero = driver.findElement(By.id(property.getProperty("no4")));
		zero.click();
		test.log(Status.INFO, "Appium click the equal symbol");
		WebElement equal = driver.findElement(By.id(property.getProperty("ans")));
		equal.click();

	}

	@Test(priority = 1)
	private void tc2() {
		test.log(Status.PASS, "Appium write the test_case 2");
		System.out.println("test_case 2");

	}

	@Test(priority = 2)
	private void tc3() {
		test.log(Status.PASS, "Appium write the test_case 3");
		System.out.println("test_case 3");
	}

	@Test(priority = 3)
	private void tc4() throws IOException {
		test.log(Status.PASS, "Appium write the test_case 4");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File img = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("./screenshot\\calc.png");
		FileUtils.copyFile(img, f);
		System.out.println("test_case4 screendhot created");
	}

//	@BeforeMethod
//	private void startDate() {
//		Date date = new Date();
//		System.out.println(date);
//	}
//
//	@AfterMethod
//	private void endDate() {
//		Date d = new Date();
//		System.out.println(d);
//	}

	@AfterSuite
	private void tc5() {
		test.log(Status.PASS, "Appium quit the apk");
		extent.flush();
		driver.quit();
	}
}

package org.inmakes.test;

import java.awt.AWTException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class MyntraMobile {
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("deviceName", "realmex7max");
		cap.setCapability("udid", "OJKRX4NRGI95GEU8");
		cap.setCapability("appPackage", "com.myntra.android");
		cap.setCapability("appActivity", "com.myntra.android.SplashActivity");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		Thread.sleep(3000);
		WebElement profile = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"tabButton_profile\"]"));
		//android.widget.Button[@content-desc="tabButton_profile"]/android.view.ViewGroup/android.widget.ImageView
		profile.click();
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//*[@text='LOG IN/SIGN UP']"));
		login.click();
		Thread.sleep(2000);
		WebElement mobile = driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"mobile\"]"));
		mobile.sendKeys("1234567803");
		Thread.sleep(5000);
		//driver.navigate().back();
		//Thread.sleep(4000);
		WebElement enter = driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"form-button\"]"));
			//	driver.findElement(By.xpath("//*[@text='CONTINUE']"));
		enter.click();
		
}
}

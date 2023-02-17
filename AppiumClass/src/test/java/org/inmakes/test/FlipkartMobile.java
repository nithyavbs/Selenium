package org.inmakes.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class FlipkartMobile {
	
	public static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException, AWTException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();

		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "13");
		cap.setCapability("deviceName", "realmex7max");
		cap.setCapability("udid", "OJKRX4NRGI95GEU8");
		cap.setCapability("appPackage", "com.android.chrome");
		cap.setCapability("appActivity", "com.google.android.apps.chrome.Main");

		URL url = new URL("http://0.0.0.0:4723/wd/hub");
		driver = new AndroidDriver(url,cap);
		Thread.sleep(3000);
		WebElement accept= driver.findElement(By.id("com.android.chrome:id/terms_accept"));
		accept.click();
		WebElement nothanks = driver.findElement(By.id("com.android.chrome:id/negative_button"));
		nothanks.click();
		Thread.sleep(3000);
		WebElement cont = driver.findElement(By.id("com.android.chrome:id/positive_button"));
		cont.click();
		
//		WebElement dAllow = driver.findElement(By.id("com.android.permissioncontroller:id/permission_deny_button"));
//		dAllow.click();
		Thread.sleep(3000);
		WebElement search = driver.findElement(By.xpath("//android.widget.EditText[@index='0']"));
		search.sendKeys("flipkart");
		Actions a = new Actions(driver);
		a.moveToElement(search).perform();
		search.click();
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		WebElement site = driver.findElement(By.xpath("//android.view.View[@index='0']"));
		site.click();
		Thread.sleep(3000);
		WebElement item = driver.findElement(By.xpath("//android.widget.TextView[@index='0']"));
		item.click();
		item.sendKeys("AppleiPhone");
		Thread.sleep(3000);
		WebElement click=driver.findElement(By.xpath("//android.view.ViewGroup[@index='1']"));
		a.moveToElement(click).perform();
		click.click();
//		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

}

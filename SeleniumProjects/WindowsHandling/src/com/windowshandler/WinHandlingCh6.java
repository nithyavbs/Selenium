package com.windowshandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandlingCh6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("mask");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//img[@loading='eager'])[1]")).click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childWin = driver.getWindowHandles();
		System.out.println(childWin);
		for (String winId : childWin) {
			if(winId!=parent) {
			driver.switchTo().window(winId);
	}
		}
		Thread.sleep(3000);
		WebElement pincode = driver.findElement(By.id("pincodeInputId"));
		pincode.sendKeys("641035");
		
	}

}

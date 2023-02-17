package com.windowshandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingCh4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("hand sanitizer");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(3000);
		WebElement handSani  = driver.findElement(By.xpath("(//img[@title='ZERMERO - Antibacterial Hand Sanitizer 2000 mL (Pack of 1)'])[1]"));	
		handSani.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childWin = driver.getWindowHandles();
		System.out.println(childWin);
		for (String winId : childWin) {
			if(winId!=parent) {
			driver.switchTo().window(winId);
			
			}
		}
		WebElement cart = driver.findElement(By.xpath("//div//span[text()='add to cart']"));
		cart.click();

	}

}

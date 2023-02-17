package com.windowshandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingCh3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.homedepot.com/");
		driver.manage().window().maximize();
		WebElement searchBar = driver.findElement(By.id("headerSearch"));
		searchBar.sendKeys("ceiling fan");
		WebElement searchIcon = driver.findElement(By.id("headerSearchButton"));
		searchIcon.click();
		Thread.sleep(4000);
		WebElement fan = driver.findElement(By.xpath("//img[@alt='Ashby Park 52 in. White Color Changing Integrated LED Brushed Nickel Ceiling Fan with Light Kit and Remote Control']"));
		fan.click();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> ChildId = driver.getWindowHandles();
		for (String winId : ChildId) {
			if(winId!=parentId) {
				driver.switchTo().window(winId);
			
			}
			
			
		}
		//driver.findElement(By.xpath("//div//h3//span[text()='Hugger 52 in. LED Indoor Brushed Nickel Ceiling Fan with Light Kit']")).click();
	}

}

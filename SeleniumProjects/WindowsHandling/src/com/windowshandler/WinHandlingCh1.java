package com.windowshandler;

import java.awt.Robot;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WinHandlingCh1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
		searchBar.sendKeys("iphone x");
		WebElement searchIcon = driver.findElement(By.id("nav-search-submit-button"));
		searchIcon.click();
		WebElement iphone = driver.findElement(By.xpath("//img[@alt='Apple iPhone XS, US Version, 256GB, Space Gray - Unlocked (Renewed)']"));
		
		iphone.click();
		String parentId = driver.getWindowHandle();
		System.out.println(parentId);
		Set<String> ChildId = driver.getWindowHandles();
		for (String winId : ChildId) {
			if(winId!=parentId) {
				driver.switchTo().window(winId);
			}
		}
		WebElement cost = driver.findElement(By.xpath("(//span[@aria-hidden='true'])[20]"));
		String price = cost.getText();
		System.out.println("cost of product: " + price);
	}

}

package com.windowshandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandlingCh5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
//		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Redmi phone");
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
		WebElement cost = driver.findElement(By.xpath("//div//div[@class='_30jeq3 _16Jk6d']"));
		String price = cost.getText();
		System.out.println("cost of product: " + price);
	}

}

package com.windowshandler;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandlingCh2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.name("keyword"));
		search.sendKeys("iphone 7 case");
		driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
		Thread.sleep(3000);
		WebElement img = driver.findElement(
				By.xpath("(//div//div//p[@title='Apple Silicon Soft cases For Apple iPhone 7 by NBOX - Silver'])[1]"));
		img.click();
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> childWin = driver.getWindowHandles();
		System.out.println(childWin);
		for (String winId : childWin) {
			if (winId != parent) {
				driver.switchTo().window(winId);

			}
		}
		WebElement cost = driver.findElement(By.xpath("//span//span[@itemprop='price']"));
		String price = cost.getText();
		System.out.println("cost of product: " + price);
		WebElement cart = driver.findElement(By.xpath("//div//span[text()='add to cart']"));
		cart.click();

	}

}

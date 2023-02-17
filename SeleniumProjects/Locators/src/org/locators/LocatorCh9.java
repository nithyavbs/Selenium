package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCh9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//div//form//div//input[@class='_2IX_2- VJZDxU']")).sendKeys("7708443003");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("6573812");
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();

	}

}

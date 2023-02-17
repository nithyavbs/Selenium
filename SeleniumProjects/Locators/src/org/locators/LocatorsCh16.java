package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh16 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='What is on your mind today?']")).sendKeys("cotton shirts");
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//h2[text()='Brainbell Tagover Combo Of 2 Brand Shirt For Men'][1]")).click();
	}

}

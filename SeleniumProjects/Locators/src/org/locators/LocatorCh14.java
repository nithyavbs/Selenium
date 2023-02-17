package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCh14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Inmakes learning hub");
		driver.findElement(By.xpath("//input[@name='btnK'][1]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'Inmakes Learning')][1]")).click();
	}

}

package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.google.com/");
		driver.manage().window().maximize();
		//[by id]
		driver.findElement(By.id("identifierId")).sendKeys("nithivbs@gmail.com");
		
	}

}

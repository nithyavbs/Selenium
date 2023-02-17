package com.robot;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotCh2 {

	public static void main(String[] args) throws AWTException  {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		Actions a = new Actions(driver);
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Inmakes_Infotech");
		a.doubleClick(search).perform();
		
		
	}

}

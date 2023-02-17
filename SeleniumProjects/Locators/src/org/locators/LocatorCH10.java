package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorCH10{

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Redmi 11 Prime 5g");
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}

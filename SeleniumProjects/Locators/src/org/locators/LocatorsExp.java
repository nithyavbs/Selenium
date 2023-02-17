package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsExp {

	public static void main(String[] args) {
		//browser configuration
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
//		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//browser launch
		WebDriver driver= new FirefoxDriver();
	//	FirefoxDriver driver = new FirefoxDriver();
//		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		//to find email webelement
	//	driver.findElementById("email").sendKeys("nithivbs@gmail.com");
		driver.findElement(By.id("email")).sendKeys("kavi@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("123456");
		driver.findElement(By.name("login")).click();
		
	}

}

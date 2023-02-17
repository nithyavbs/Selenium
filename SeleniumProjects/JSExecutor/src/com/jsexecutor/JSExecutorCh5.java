package com.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorCh5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement uname = driver.findElement(By.name("username"));
		WebElement pwd = driver.findElement(By.id("password"));
		WebElement signin = driver.findElement(By.id("login"));
		js.executeScript("arguments[0].setAttribute('value','nithivbs@gmail.com')", uname);
		js.executeScript("arguments[0].setAttribute('value','123456')", pwd);
		js.executeScript("arguments[0].click()", signin);
	}

}

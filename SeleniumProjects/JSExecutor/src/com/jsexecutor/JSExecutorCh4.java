package com.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorCh4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement email = driver.findElement(By.name("email"));
		WebElement pwd = driver.findElement(By.id("pass"));
		WebElement signin = driver.findElement(By.name("login"));
		js.executeScript("arguments[0].setAttribute('value','nithivbs@gmail.com')", email);
	  js.executeScript("arguments[0].setAttribute('value','123456')", pwd);
	  js.executeScript("arguments[0].click()", signin);
	}

}

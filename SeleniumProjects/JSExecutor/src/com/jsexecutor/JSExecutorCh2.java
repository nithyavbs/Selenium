package com.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorCh2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://toolsqa.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement downElt = driver.findElement(By.xpath("//a[text()='+ Subscribe']"));
		js.executeScript("arguments[0].scrollIntoView(false)", downElt);
		

		WebElement upElt = driver.findElement(By.xpath("//a[text()='Latest Articles']"));
		js.executeScript("arguments[0].scrollIntoView(true)", upElt);

	}

}

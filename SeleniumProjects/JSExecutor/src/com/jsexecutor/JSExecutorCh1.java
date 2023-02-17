package com.jsexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorCh1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://inmakesedu.com/");

		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement text = driver.findElement(By.xpath("//div//div//p[contains(text(),'offer various kinds')]"));

		Object executeScript = js.executeScript("arguments[0].scrollIntoView(false)", text);
		System.out.println(text.getText());

	}

}

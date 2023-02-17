package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertCh3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement btn = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		btn.click();
		WebElement btn2 = driver.findElement(By.xpath("//button[contains(text(),'prompt box')]"));
		btn2.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		String text = alert.getText();
		System.out.println("Before ALert" + text);
		alert.sendKeys("Nithya");
		alert.accept();

	}

}

package com.jsexecutor;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSExecutorCh6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement loginBtn = driver.findElement(By.xpath("//div//div//div//div//a[text()='Login']"));
		js.executeScript("arguments[0].click()", loginBtn);
		WebElement email = driver.findElement(By.xpath("(//div//div//form//div//input[@type='text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','nithivbs@gmail.com')", email);
		Object emailText = js.executeScript("return arguments[0].getAttribute('value')",email);
		System.out.println(emailText);
		WebElement pwd = driver.findElement(By.xpath("//div//div//form//div//input[@type='password']"));
		js.executeScript("arguments[0].setAttribute('value','345678')", pwd);
		Object pwdText = js.executeScript("return arguments[0].getAttribute('value')",pwd);
		System.out.println(pwdText);
		WebElement submit = driver.findElement(By.xpath("(//div//button[@type='submit'])[2]"));
		js.executeScript("arguments[0].click()", submit);
				
	}

}

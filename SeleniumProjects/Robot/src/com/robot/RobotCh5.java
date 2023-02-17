package com.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotCh5 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions a = new Actions(driver);
//		Thread.sleep(3000);
		WebElement closeBtn = driver.findElement(By.xpath("//button[text()='✕']"));
		closeBtn.click();
		WebElement item = driver.findElement(By.xpath("(//div//div//img[@loading='eager'])[1]"));
		a.moveToElement(item).perform();
		a.contextClick(item).perform();
		
		
		Robot r= new Robot();
		for(int i=1;i<6;i++) {
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}

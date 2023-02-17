package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh15 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
		WebElement userId = driver.findElement(By.xpath("//div//form//div//input[@class='_2IX_2- VJZDxU']"));
			userId.sendKeys("7708443003");
			String uid = userId.getAttribute("value");
		System.out.println("User id:"+ uid);
	
		WebElement pwd = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		pwd.sendKeys("6573812");
		String pwdVal=pwd.getAttribute("value");
		System.out.println("Password:"+ pwdVal);

	}

}

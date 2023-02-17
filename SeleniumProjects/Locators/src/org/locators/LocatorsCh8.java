package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.cleartrip.com/trains");
		driver.findElement(By.name("from_station")).sendKeys("Coimbatore");
		driver.findElement(By.name("to_station")).sendKeys("Chennai");
		driver.findElement(By.xpath("(//button[@id='trainFormButton'])[1]")).click();
	}

}

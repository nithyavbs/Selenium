package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com/");
		WebElement elt = driver.findElement(By.xpath("//h1[text()='Learning Today For A Better Tomorrow']"));
		String text = elt.getText();
		System.out.println("print text:" + text);
	}

}

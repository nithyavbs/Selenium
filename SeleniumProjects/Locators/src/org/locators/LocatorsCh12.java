package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com/about_us");
		WebElement elt = driver.findElement(By.xpath("//h2[contains(text(), 'learning hub')]"));
		String text = elt.getText();
		System.out.println("print text:" + text);

	}

}

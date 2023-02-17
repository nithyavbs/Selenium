package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsCh13 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://inmakesedu.com");
		WebElement elt = driver.findElement(By.xpath("//a[contains(text(),'02-01 Mai tower Al nahda 1,Dubai')]"));
		String txt = elt.getText();
		System.out.println("print text:" + txt);
	}

}

package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCh4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement country = driver.findElement(By.name("country"));
		Select s= new Select(country);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement countries = options.get(i);
			String textCountry = countries.getText();
			System.out.println(textCountry);
		}
		
		
		
	}

}

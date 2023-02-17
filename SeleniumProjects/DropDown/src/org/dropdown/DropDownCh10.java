package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCh10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		s.selectByIndex(0);
		s.selectByValue("apple");
		s.selectByVisibleText("Orange");
		s.selectByIndex(3);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		for(int i=0;i<allSelectedOptions.size();i++) {
			WebElement element = allSelectedOptions.get(i);
			String text = element.getText();
			System.out.println(text);
		}
		
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String first = firstSelectedOption.getText();
		System.out.println("First Selected Option:" + first);
	}

}

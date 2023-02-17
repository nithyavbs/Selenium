package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCH9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://output.jsbin.com/osebed/2");
		driver.manage().window().maximize();
		WebElement fruits = driver.findElement(By.id("fruits"));
		Select s = new Select(fruits);
		s.selectByIndex(1);
		s.selectByIndex(3);
		
		List<WebElement> options = s.getOptions();
		for(int i=0; i<options.size();i++) {
			if(i%2!=0) {
				WebElement element = options.get(i);
				String text = element.getText();
				System.out.println("selected options:" + text);
			}else {
				WebElement deElt = options.get(i);
				String text = deElt.getText();
				System.out.println("Deselected options:" + text);
			}
				
		}
	}

}

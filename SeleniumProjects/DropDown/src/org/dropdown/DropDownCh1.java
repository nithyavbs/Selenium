package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCh1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");

		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div//a[@role='button'])[2]")).click();
		Thread.sleep(4000);
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s = new Select(year);
		List<WebElement> yearOpts= s.getOptions();
		for(int i=0;i<yearOpts.size();i++) {
			WebElement opt = yearOpts.get(i);
			String years = opt.getText();
			System.out.println(years);
		}
		
	}

}

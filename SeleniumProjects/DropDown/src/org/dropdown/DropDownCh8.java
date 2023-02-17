package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCh8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/SearchHotel.php");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Nithyavbs");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("LA5JU0");
		driver.findElement(By.id("login")).click();
		WebElement aRoom = driver.findElement(By.name("adult_room"));
		Select s = new Select(aRoom);
		List<WebElement> options = s.getOptions();
		for(int i=0;i<options.size();i++) {
			WebElement adltRoom = options.get(i);
			String text =  adltRoom.getText();
		System.out.println(text);
	}

}}

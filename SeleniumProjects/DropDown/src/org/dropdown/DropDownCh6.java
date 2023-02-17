package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownCh6 {

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
		WebElement roomType = driver.findElement(By.id("room_type"));
		Select s= new Select(roomType);
		List<WebElement> roomOptions = s.getOptions();
		for(int i=0;i<roomOptions.size();i++)
		{
			WebElement rOpt = roomOptions.get(i);
			String roomTypes = rOpt.getText();
			System.out.println(roomTypes);
		}
		
	}

}

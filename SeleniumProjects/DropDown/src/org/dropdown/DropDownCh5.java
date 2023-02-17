package org.dropdown;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownCh5 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/BookHotel.php");
		driver.manage().window().maximize();
		WebElement uname = driver.findElement(By.id("username"));
		uname.sendKeys("Nithyavbs");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("LA5JU0");
		driver.findElement(By.id("login")).click();
		
		TakesScreenshot ts= (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest= new File("./WebPageScreenShots/homepage.png");
		
		FileUtils.copyFile(src, dest);
		
	}

}

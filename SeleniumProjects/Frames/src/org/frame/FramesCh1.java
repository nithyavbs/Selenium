package org.frame;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesCh1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		WebElement frameElt = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frameElt);
		driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

}

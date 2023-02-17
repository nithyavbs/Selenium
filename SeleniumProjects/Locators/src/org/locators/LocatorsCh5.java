package org.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsCh5 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Nithya");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Vbs");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Saravanampatti,Coimbatore");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nithivbs@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9867523891");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.xpath("//input[@value='Cricket']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		driver.findElement(By.id("firstpassword")).sendKeys("54321");
		driver.findElement(By.id("secondpassword")).sendKeys("54321");
		driver.findElement(By.id("Skills")).sendKeys("C");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("yearbox")).sendKeys("1988");
		driver.findElement(By.id("daybox")).sendKeys("10");
		driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("July");
		driver.findElement(By.id("imagesrc")).sendKeys("C://Users//kesarsoft//Downloads//1.PNG");
		WebElement e = driver.findElement(By.xpath("//multi-select/div[@id='msdd']"));
		Select s = new Select(e);
		s.selectByValue("English");
		driver.findElement(By.name("signup")).click();

}
}

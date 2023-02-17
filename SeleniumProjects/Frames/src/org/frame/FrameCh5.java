package org.frame;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameCh5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		WebElement frameElt = driver.findElement(By.xpath("//iframe[@id='Revamp_Banner_ID']"));
		js.executeScript("arguments[0].scrollIntoView()", frameElt);
		driver.switchTo().frame(frameElt);
		WebElement userId = driver.findElement(By.xpath("//input[@id='DUMMY1']"));
		userId.sendKeys("1563472");
		driver.findElement(By.xpath("//img[@id='user-id-goahead']")).click();
		
	}

}

package org.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicPgm {

	public static void main(String[] args) {
		// 1.browser configuration

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			//	"C:\\Users\\kesarsoft\\eclipse-workspace\\SeleniumInmakes\\drivers\\chromedriver.exe");

		// 2.browser launching

		WebDriver driver = new ChromeDriver();
		// get
		driver.get("https://mail.google.com/");
		// maximize window
		driver.manage().window().maximize();
		// get title
		String title = driver.getTitle();
		System.out.println("Title of the page:" + title);
		// get currentUrl

		String currentUrl = driver.getCurrentUrl();

		System.out.println("current page url:" + currentUrl);

		driver.get("https://www.flipkart.com/");
		String pageTitle = driver.getTitle();
		System.out.println("Title of the page:" + pageTitle);
		String pageUrl = driver.getCurrentUrl();

		System.out.println("current page url:" + pageUrl);
		
		driver.close();
		driver.quit();
		

	}

}

package org.stepdefinition;

	import java.io.IOException;

	import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import com.base.BaseClass;
	import com.sample.MyntraPojo;

	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;
	import io.github.bonigarcia.wdm.WebDriverManager;
	public class Myntra extends BaseClass {

		MyntraPojo mp;
		@Given("To launch the chrome browser and maximize window")
		public void to_launch_the_chrome_browser_and_maximize_window() {
		 launchBrowser();
		 windowMaximize();
			 launchUrl("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK&gclid=CjwKCAiAxvGfBhB-EiwAMPakqpQsaQ4mmCEXplpeeWWt4DJ47IvACgKhLE5NCAI8qEcUOUq2BjOUmxoCBqIQAvD_BwE");
		}
		@When("To Type and search the T-Shirt product")
		public void to_Type_and_search_the_T_Shirt_product() throws InterruptedException {
			mp=new MyntraPojo();
			Thread.sleep(3000);
//			WebElement find = driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']"));
//			passText("T-Shirt", find);
			passText("T-Shirt",mp.getSearch());
			clickBtn(mp.getSearchIcon());
		}

		@When("To Select the first product and select the M size")
		public void to_Select_the_first_product_and_select_the_M_size() throws InterruptedException {
//			driver.switchTo().window("https://www.myntra.com/t-shirt");
			mp=new MyntraPojo();
			clickBtn(mp.getFirstImg());
			String winHandleBefore = driver.getWindowHandle();
			for(String winHandle : driver.getWindowHandles()){
			   driver.switchTo().window(winHandle);
			}
//			String currentUrl = driver.getCurrentUrl();
//			driver.navigate().to(currentUrl);
//			driver.switchTo().window(currentUrl);
//			String windowHandle = driver.getWindowHandle();
//			driver.navigate().to(currentUrl);
			Thread.sleep(3000);
//			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement mBtn = driver.findElement(By.xpath("(//button//p[@class='size-buttons-unified-size'])[2]"));
//			js.executeScript("arguments[0].scrollIntoView(false)", mBtn);
			mBtn.click();
//			clickBtn(mp.getmSizeBtn());
		}

		@When("To click the Add To Bag button and close the current tab")
		public void to_click_the_Add_To_Bag_button_and_close_the_current_tab() throws InterruptedException {
			mp=new MyntraPojo();
		clickBtn(mp.getAddToBag());
//		clickBtn(mp.getAddBag());
		Thread.sleep(2000);
		String second= driver.getWindowHandle();
		System.out.println(second);
//		driver.close();
		}
	//
		@When("Close the current tab")
		public void close_the_current_tab() {
			driver.close();
		}

		@When("To click the bag icon")
		public void to_click_the_bag_icon() {
			String prev = driver.getWindowHandle();
			System.out.println(prev);
			mp=new MyntraPojo();
			clickBtn(mp.getBagIcon());
			
		}
	//
		@When("Take the screenshot selected bag")
		public void take_the_screenshot_selected_bag() throws IOException {
			mp=new MyntraPojo();
			mp.screenShot("img.png");
		}
		@Then("Close the browser")
		public void close_the_browser() {
//			driver.quit();
		}
	}


package org.stepdefinition;

import java.awt.Robot;
import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.base.BaseClass;
import com.sample.RedBusPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RedBus extends BaseClass {

	RedBusPojo rp;

	@Given("The user enters the testing redbus site")
	public void the_user_enters_the_testing_redbus_site() {
		launchBrowser();
		windowMaximize();
		launchUrl("https://www.redbus.in/");
	}

	@When("click the from field and give the src city name")
	public void click_the_from_field_and_give_the_src_city_name() throws AWTException {
		rp = new RedBusPojo();
		passText("Namakkal", rp.getSrc());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("click the to field and give the dest city name")
	public void click_the_to_field_and_give_the_dest_city_name() throws AWTException {
		rp = new RedBusPojo();
		passText("Kanyakumari", rp.getDest());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("click the date field and calender icon")
	public void click_the_date_field_and_calender_icon() {
		rp = new RedBusPojo();
		clickBtn(rp.getDate());
	}

	@When("select the journey date")
	public void select_the_journey_date() throws InterruptedException {
		Thread.sleep(3000);
		clickBtn(rp.getDate());
		Actions a = new Actions(driver);
		WebElement mouseOver = driver.findElement(By.xpath("//tr//td[@class='monthTitle']"));
		a.moveToElement(mouseOver).perform();
		driver.findElement(By.xpath("//tr//td[@class='wd day']")).click();
		Thread.sleep(3000);
	}
	@Then("click the search and check the output")
	public void click_the_search_and_check_the_output() throws InterruptedException {
//		Alert alert = driver.switchTo().alert();
//		Thread.sleep(2000);
//		alert.dismiss();
		rp = new RedBusPojo();
//		clickBtn(rp.getSearchBtn());
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(3000);
	}
	//scenario outline
	@Given("The user enters the testing redbus sites")
	public void the_user_enters_the_testing_redbus_sites() {
		launchUrl("https://www.redbus.in/");
	}

	@When("user click the from field and pass the data {string} in from field")
	public void user_click_the_from_field_and_pass_the_data_in_from_field(String src) throws AWTException, InterruptedException {
		rp = new RedBusPojo();
		passText(src,rp.getSrc());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("user click the to field and  pass the data {string} in to field")
	public void user_click_the_to_field_and_pass_the_data_in_to_field(String dest) throws AWTException, InterruptedException {
		rp = new RedBusPojo();
		passText(dest,rp.getDest());
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	@When("user select the journey date")
	public void user_select_the_journey_date() throws InterruptedException {
		Thread.sleep(3000);
		clickBtn(rp.getDate());
		Actions a = new Actions(driver);
		WebElement mouseOver = driver.findElement(By.xpath("//tr//td[@class='monthTitle']"));
		a.moveToElement(mouseOver).perform();
//	driver.findElement(By.xpath("//button[text()='>']")).click();
		
		WebElement mouse=driver.findElement(By.xpath("//tr//td[@class='wd day']"));
		a.moveToElement(mouse).perform();
		mouse.click();
		Thread.sleep(3000);
	}

	@Then("click the search and check the outputs")
	public void click_the_search_and_check_the_outputs() throws InterruptedException {
		rp = new RedBusPojo();
//		clickBtn(rp.getSearchBtn());
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
		Thread.sleep(3000);
	}
}

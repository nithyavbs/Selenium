package com.test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.BaseClass;
public class SampleTest extends BaseClass {

	@BeforeClass
	private void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
System.out.println("Launch Browser....");
	}
	@Test
	private void tc1() {
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S1762022910%3A1671689808736226&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dtext%28%29%2Bin%2Bxpath%26rlz%3D1C1CHBF_enIN933IN933%26sxsrf%3DALiCzsavyBWukNtZMikgso_el6T0utTFjg%3A1671688098679%26source%3Dlnms%26tbm%3Disch%26sa%3DX%26ved%3D2ahUKEwjN26-6w4z8AhX6wnMBHZUkCWAQ_AUoAXoECAEQAw%26biw%3D1366%26bih%3D625%26dpr%3D1%26sfr%3Dvfe&sacu=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh4vGumZjgm2TrneSKiAQOFF220Ptuk4NT4xh4a3vqGi6zXSaSG29xSB8-_xH_aMt8MfhSSFmg");
		GmailLoginPojo gp=new GmailLoginPojo();
		passText("nithiblossom@gmail.com", gp.getEmail());
		gp.getNext().click();
//		passText("23456869", gp.getPwd());
//		gp.getNext().click();
	}
	@Test(enabled=false)
	private void tc9() {
		launchUrl("https://inmakes.com/");
			}
	@Test(invocationCount=2)
	private void tc5() {
		launchUrl("https://www.redbus.in/");
		}
	@BeforeMethod
	private void startDate() {
		Date d=new Date();
System.out.println("Test case Starting Date and Time"  + d);
	}
	@AfterMethod
	private void endDate() {
		Date d=new Date();
		System.out.println("Test Case ending Date and Time" + d);
	}
	@AfterClass
	private void closeTheBrowser() {
System.out.println("Browser CLosed!");
	}
}

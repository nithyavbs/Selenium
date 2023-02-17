package com.junit.testing;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleJunit extends BaseClass {
	@BeforeClass
	public static void launchTheBrowser() {
		launchBrowser();
		windowMaximize();
	}

	@Test
	public void tc4() {
		System.out.println("Test Case 4: Inmakes");
		launchUrl("https://inmakes.com/");
	}

	@Before
	public void startDate() {
		launchBrowser();
		windowMaximize();
	}

	@Test
	public void tc() {
		System.out.println("Test Case 0: Youtube");
		launchUrl("https://www.youtube.com/");
	}

	@Test
	public void tc1() {
		System.out.println("Test Case 1: Gmail");
		launchUrl("https://accounts.google.com/v3/signin/identifier?dsh=S1762022910%3A1671689808736226&continue=https%3A%2F%2Fwww.google.com%2Fsearch%3Fq%3Dtext%28%29%2Bin%2Bxpath%26rlz%3D1C1CHBF_enIN933IN933%26sxsrf%3DALiCzsavyBWukNtZMikgso_el6T0utTFjg%3A1671688098679%26source%3Dlnms%26tbm%3Disch%26sa%3DX%26ved%3D2ahUKEwjN26-6w4z8AhX6wnMBHZUkCWAQ_AUoAXoECAEQAw%26biw%3D1366%26bih%3D625%26dpr%3D1%26sfr%3Dvfe&sacu=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AeAAQh4vGumZjgm2TrneSKiAQOFF220Ptuk4NT4xh4a3vqGi6zXSaSG29xSB8-_xH_aMt8MfhSSFmg");
		String title=pageTitle();
		String url=pageUrl();
		GmailLoginPojo gp=new GmailLoginPojo();
		passText("nithiblossom@gmail.com", gp.getEmail());
		gp.getNext().click();
		Assert.assertEquals("Check ur Url",url, url.contains("gmail"));
		passText("23456869", gp.getPwd());
		gp.getNext().click();
		

	}

	@Test
	public void tc2() {
		System.out.println("Test Case 2: Facebook");
		launchUrl("https://en-gb.facebook.com/");
	}

	@After
	public void endDate() {
		closeEntireBrowser();
	}

	@Ignore
	@Test
	public void tc3() {
		System.out.println("Test Case 3");
	}

	@AfterClass
	public static void closeTheBrowser() {
		closeEntireBrowser();
	}
}

package org.stepdefinition;

import org.junit.After;
import org.junit.Before;

import com.base.BaseClass;

public class HooksClass extends BaseClass{

	@Before
	//precondition
	private void precondition1(){
		launchBrowser();
}
	@Before
	//precondition
	private void precondition2(){
		windowMaximize();
}
	
	@After
	//Postcondition
	private void postcondition() {
		closeEntireBrowser();
	}
	
}


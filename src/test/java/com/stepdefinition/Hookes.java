package com.stepdefinition;

import com.resoures.FunctionalLibrary;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookes extends FunctionalLibrary {
	@Before
	public void beforeBackground() {
		launch("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}
	@After
	public void afterScenario(){
driver.quit();
}
}
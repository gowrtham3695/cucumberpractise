package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.objectrepository.HomePage;
import com.resoures.FunctionalLibrary;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMLogIn extends FunctionalLibrary{
	WebDriver driver;
	@Given("user is on login page")
	public void user_is_on_login_page() {
		
	}

	@When("user enters the valid username and password")
	public void user_enters_the_valid_username_and_password() {
		
		HomePage log = new HomePage();
	getUserName(log.getUsername(),"Admin");
	getpassword(log.getPassword(),"admin123");
		
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		HomePage log = new HomePage();
		toClick(log.getLoginutton());
	}

	@Then("orange HRM home page should be displayed")
	public void orange_HRM_home_page_should_be_displayed() {
		
	}



}

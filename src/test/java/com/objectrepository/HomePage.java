package com.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resoures.FunctionalLibrary;

public class HomePage extends FunctionalLibrary {
	public HomePage() {
		PageFactory.initElements(driver, this);
}
	@FindBy(id="txtUsername")
	private WebElement username;
	@FindBy(id="txtPassword")
	private WebElement password;
	@FindBy(id="btnLogin")
	private WebElement loginutton;
	public WebElement getUsername() {
		return username;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLoginutton() {
		return loginutton;
	}
	
}

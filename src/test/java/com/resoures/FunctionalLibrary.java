package com.resoures;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalLibrary {
	public static WebDriver driver;
	 public void launch(String url) {
		 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Barath\\selenium\\Practice\\driver\\geckodriver.exe");
		 driver= new FirefoxDriver();
driver.get(url);
}
	 public void getUserName(WebElement ele ,String value) {
		 ele.sendKeys(value);}
		 public void getpassword(WebElement ele ,String pass) {
		 ele.sendKeys(pass);
		

	}
	 public void toClick(WebElement ele) {
		 ele.click();
		

	}
	 

}

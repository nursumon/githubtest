package com.qa.wildcart.page_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	 WebDriver driver;
	 
	 
	 public LoginPage(WebDriver driver) {
		 this.driver=driver;
		 
	 }
	
	By loginBtn=By.id("dLabellogin");
	By userName=By.id("username");
	By passWord=By.id("password");
	By loginButton=By.id("jqLogin");
	By signUp=By.id("jqSignup");
	
	
	public HomePage loginPage(String un, String pas) {
		
		driver.findElement(loginBtn).click();
		driver.findElement(userName).sendKeys(un);
		driver.findElement(passWord).sendKeys(pas);
		driver.findElement(loginButton).click();
		return new HomePage(driver);
	}

}

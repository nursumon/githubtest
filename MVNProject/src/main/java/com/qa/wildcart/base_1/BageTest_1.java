package com.qa.wildcart.base_1;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.qa.wildcart.page_1.LoginPage;

public class BageTest_1  {
	static WebDriver driver;
	static BasePage_1 bp;
	static Properties prop;
	static LoginPage lp;

	public static void main(String[] args) {
		
		bp =new BasePage_1();
		prop =bp.readProperties();
		driver=bp.launch_driver(prop.getProperty("Browser"));
		
		driver.get(prop.getProperty("url"));
		lp = new LoginPage(driver);
		lp.loginPage(prop.getProperty("userName"), prop.getProperty("password"));
		
		
		
		
	}
	
	
	
}
	
	
	
		
	
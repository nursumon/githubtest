package com.qa.wildcart.base_1;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage_1 {
	
	public WebDriver driver;
	public static Properties prop ;
	public static FileInputStream fis;
	
	
	 public Properties readProperties() {

			try {
				prop =new Properties();
				fis = new FileInputStream("C:\\Users\\19177\\eclipse-workspace\\MVNProject\\src\\main\\java\\com\\qa\\wildcart\\properties\\config.properties");
				prop.load(fis);
			} catch (Exception e) {
			
				e.printStackTrace();
				System.out.println(e);
			}
		
			String str=prop.getProperty("Browser");
			System.out.println(str);
			return prop;
		}
		
		
		

	

	
	
	
	public WebDriver launch_driver(String browsername) {
		if(browsername.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if (browsername.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("safari")) {
			WebDriverManager.getInstance(SafariDriver.class).setup();
			driver=new SafariDriver();
		}
		else
		{   
			System.out.println("Browser Not Found ");
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.get(prop.getProperty("url"));
		return driver;
		
		
		
		}
	}
	
	
	
	



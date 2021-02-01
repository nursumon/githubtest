package CollectionTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Safari {

	public static void main(String[] args) {
		
		
		
//		WebDriverManager.getInstance(SafariDriver.class).setup();
//		WebDriver driver=new SafariDriver();
//		driver.get("http://amazon.com");

		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		
	}

}

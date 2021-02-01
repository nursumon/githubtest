package CollectionTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDrpdownSorted {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech");
		String[] vals = driver.getTitle().split(" ");
		for (String str : vals) {
			System.out.println(str);
		}
    }
}



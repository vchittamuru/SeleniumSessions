package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back(); 
		driver.navigate().forward();
		driver.navigate().refresh();

		
		
	}

}

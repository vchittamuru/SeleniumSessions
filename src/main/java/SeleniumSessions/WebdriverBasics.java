package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasics {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();
		
		
		
		
	}

}

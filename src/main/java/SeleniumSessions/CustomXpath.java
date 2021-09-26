package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CustomXpath {
	
	WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	
		
		//htmltag[contains(@property, 'value')]
		
		
		//input[contains(@id, 'txtUsername')]
		
		//input[contains(@id, 'txtUsername') and @type='text']
		
		
		//htmltag[starts-with(text(),'text')]
		
		//a[starts-with(text(),'Forgot ')]

		
		
		
	}

}

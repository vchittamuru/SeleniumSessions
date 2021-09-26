package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		//Using findElements by tag name to get all the links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		//To get the total no. of links
		System.out.println("Total links: " + links.size());
		
		
		//TO print all the links
		for(int i=0; i<=links.size(); i++) {
			
				String text = links.get(i).getText();
				
				if(text.equals(null) || text.equals("")) {
				}
				
				System.out.println(text);
				
				
		}
		
	}

}

package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		WebElement email = driver.findElement(By.id("username"));
		email.sendKeys("vrchittamuru@gmail.com");
		
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("test@12345");
		
		driver.findElement(By.id("lgBtn")).click();
		
		
		
	}

}

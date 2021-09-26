package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsClassConcept {

	static WebDriver driver;
	//static WebElement element;
	public static void main(String[] args) {

		//Chrome driver setup
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//get URL
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//Get the elements
		WebElement username = driver.findElement(By.id("txtUsername"));
		WebElement pwd = driver.findElement(By.id("txtPassword"));
		WebElement lgnBtn = driver.findElement(By.id("btnLogin"));
		
		//Do actions
		Actions action = new Actions(driver); 
		action.moveToElement(username).click().sendKeys("Admin").build().perform();
		action.moveToElement(pwd).click().sendKeys("admin123").build().perform();
		action.moveToElement(lgnBtn).click().build().perform();
		
		
		
	}

}

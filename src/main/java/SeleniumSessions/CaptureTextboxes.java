package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTextboxes {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		List<WebElement> txtList = driver.findElements(By.tagName("input"));
		
		System.out.println(txtList.size());
		
		for(int i=0; i<=txtList.size();i++) {
			txtList.get(i).sendKeys("Venkat");
		}
		
	}

}

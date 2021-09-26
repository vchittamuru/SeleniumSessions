package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTextboxText {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.id("login1")).sendKeys("test@gmail.com");
		
		//Capture the text entered in the textbox
		String value = driver.findElement(By.id("login1")).getAttribute("value");
		//String value1 = driver.findElement(By.id("login1")).getText();
		System.out.println(value);
	}

}
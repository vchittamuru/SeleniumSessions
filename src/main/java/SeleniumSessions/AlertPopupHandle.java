package SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		//switch to alert
		Alert alert = driver.switchTo().alert();
		
		//Get the alert text
		String text = alert.getText();
		System.out.println(text);
		
		//To Click OK button in the popup
		alert.accept();
		
		//TO Click cancel but in the popup
		alert.dismiss();
		
		
	}

}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueConcept {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/hris-hr-software-demo/");
		
		WebElement country = driver.findElement(By.name("Country"));

		selectDropownValue(country, "index", "5"); //By Index
		selectDropownValue(country, "value", "india"); //By value
		selectDropownValue(country, "visibeltext", "India"); //By Text
		
	}
	
	
	//Creating method to call all the types
	public static void selectDropownValue(WebElement element, String type, String value) {
		
		Select select = new Select(element);
		
		switch (type) {
		case "index":
			select.selectByIndex(Integer.parseInt(value));
			break;
			
		case "value":
			select.selectByValue(value);
			break;
			
		case "visibeltext":
			select.selectByVisibleText(value);
			break;

		default:
			System.out.println("Pass the correct value..");
			break;
		}
		
	}
	
	//Creating generic function
	public static void dropdownValue(WebElement element, String value) {
		
		Select select  = new Select(element);
		select.selectByVisibleText(value);
		select.getOptions();
	}

}

package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageCapture {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> imgList =  driver.findElements(By.tagName("img"));
		
		//To print the images count
		System.out.println(imgList.size());
		
		//TO print all the image links
		for(int i=0; i<=imgList.size(); i++) {
			String imgUrl = imgList.get(i).getAttribute("src");
			System.out.println(imgUrl);
			
		}
	}

}

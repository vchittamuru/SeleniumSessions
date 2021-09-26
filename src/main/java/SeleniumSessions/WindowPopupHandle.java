package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopupHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//parent URL
		driver.get("https://www.seleniumeasy.com/test/window-popup-modal-demo.html");
		
		//Child1 URL
		driver.findElement(By.linkText("Follow On Twitter")).click();
		
		//child2 URL
		driver.findElement(By.linkText("Follow Twitter & Facebook")).click();
				
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		String childWindowId1 = it.next();
		String childWindowId2 = it.next();
		
		//Switch to child1 window and do actions required
		driver.switchTo().window(childWindowId1);
		System.out.println("Child Window title is "+driver.getTitle());
		driver.close();
		
				
		//switch back to parent window and do actions required
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window title is "+driver.getTitle());
				
		//switch to child2 window and do actions required
		driver.switchTo().window(childWindowId2);
		System.out.println("Child2 Window title is "+driver.getTitle());
		driver.close();
		
		//switch back to parent window and do actions required
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window title is "+driver.getTitle());
		driver.quit();
		
	}

}

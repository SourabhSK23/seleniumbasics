package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPractice {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.seleniumframework.com/Practiceform/");

		System.out.println(driver.getTitle());
		
		
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.id("button1")).click();
		Set <String> handles=driver.getWindowHandles();
		
		Iterator<String> it=handles.iterator();
		it.next();
		String childWindow=it.next();
		System.out.println("This is cd" + childWindow);
		driver.switchTo().window(childWindow);
	}

}

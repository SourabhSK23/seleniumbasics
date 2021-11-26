package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		driver.findElement(By.id("alert")).click();
		String actualText=driver.switchTo().alert().getText();
		String expectedText="Please share this website with your friends and in your organization.";
		if(actualText.equals(expectedText)) {
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test failed");
		}
		driver.switchTo().alert().accept();

	}

}

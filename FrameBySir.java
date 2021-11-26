package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameBySir {

	public static void main(String[] args) {


			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.get("http://the-internet.herokuapp.com/iframe");

			List<WebElement> frames =  driver.findElements(By.tagName("iframe"));

			System.out.println(frames.size());

			//driver.switchTo().frame(0);

			WebElement frame=  driver.findElement(By.id("mce_0_ifr"));

			driver.switchTo().frame(frame);

			driver.findElement(By.id("tinymce")).clear();

			driver.findElement(By.id("tinymce")).sendKeys("Ajay");

			driver.switchTo().parentFrame();
			Assert.assertTrue(false, "ad");
			driver.quit();

			}

			

}

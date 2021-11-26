package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class FrameDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/iframe");
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).clear();
		driver.findElement(By.xpath("//*[@id=\"tinymce\"]/p")).sendKeys("Sourabh");
	
	
	
	}

}

package seleniumbasics;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Flipkart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/shop");
		List<WebElement> lst=driver.findElements(By.xpath("//div[@class='card-footer']/button"));
		for(WebElement webElement : lst) {
			String ip = webElement.getText();
			System.out.println(ip);
			if (ip.equals("iphone X")){
				driver.findElement(By.xpath("//div[@class='card-footer']/button")).click();
			}
		}
		driver.findElement(By.xpath("//*[@id='navbarResponsive']/ul/li/a")).click();
		
		//if(txt.equals("iphone X")){
		//	driver.findElement(By.xpath("//a[contains(@class,'btn-primary')]")).click();
		//}
		 
	
	}

}



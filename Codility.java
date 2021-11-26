package seleniumbasics;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Codility {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver webDriver=new ChromeDriver();
			webDriver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_search/6f03f4361b080eeb747193aadd94cd2b/static/attachments/reference_page.html");
	        webDriver.findElement(By.id("search-input")).sendKeys("isla");
	        webDriver.findElement(By.id("search-button")).click();
	        Thread.sleep(3000);
	        List<WebElement> lst = webDriver.findElements(By.xpath("//*[@id='search-results']//li"));
	        int x=lst.size();
	        Assert.assertTrue(x >= 1);

	}

}

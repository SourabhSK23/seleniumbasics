package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b")).click();
		driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]")).click();
		driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
		driver.findElement(By.xpath("//*[@id=\"btnAdd\"]")).click();
		driver.findElement(By.cssSelector("#jobTitle_jobTitle")).sendKeys("Testing");
		driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Perform manual testing and also perform automation testing for web based application ");
		driver.findElement(By.xpath("//*[@id=\"jobTitle_note\"]")).sendKeys("Only certified testers can apply");
		driver.findElement(By.id("btnSave")).click();
		driver.quit();
	}

} 
package day24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10)); //explicit wait declaration
		
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
		
		
		//usage
		try 
		{
			WebElement weblink=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[normalize-space()='Selenium']")));
			weblink.click();		
		}
		
		catch (Exception e) 
		{
			System.out.println("Element not Found...");
		}
		
		driver.quit(); 


	}

}

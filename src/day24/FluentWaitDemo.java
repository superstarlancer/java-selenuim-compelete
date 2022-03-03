package day24;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;


public class FluentWaitDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		//declaration

		   // Waiting 30 seconds for an element to be present on the page, checking
		   // for its presence once every 5 seconds.
		
		  // declaration of fluent wait
		   Wait<WebDriver> mywait = new FluentWait<WebDriver>(driver)
		       .withTimeout(Duration.ofSeconds(30))
		       .pollingEvery(Duration.ofSeconds(5))
		       .ignoring(NoSuchElementException.class);
		
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
			
		//usage of fluent wait
		 WebElement weblink= mywait.until(new Function<WebDriver, WebElement>() {
		     public WebElement apply(WebDriver driver) {
		       return driver.findElement(By.xpath("//h3[text()='Selenium']"));
		     }
		   });
		 
		 
		 weblink.click();
		

	}

}

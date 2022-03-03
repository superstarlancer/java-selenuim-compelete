package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatement {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys(Keys.RETURN);
		
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//h3[normalize-space()='Selenium']")).click();
		
	}

}

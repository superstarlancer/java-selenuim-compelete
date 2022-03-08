package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)How to find rows in a table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		
		//another approach if you have one table on your web page 
		//int rows=driver.findElements(By.tagName("tr")).size(); 
		System.out.println("Total Number of rows:\s"+rows);
		

	}

}

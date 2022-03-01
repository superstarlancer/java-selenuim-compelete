package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//Absolute xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("T-Shirts");
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/button[1]")).click();
		
		//Relative xpath
		//driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@name='submit_search']")).click();

		//xpath with multiple attributes
		//driver.findElement(By.xpath("//input[@id='search_query_top'][@name='search_query']")).sendKeys("T-shirts");
		//driver.findElement(By.xpath("//button[@type='submit'][@name='submit_search']")).click();
		
		
		//xpath with OR operator
		//driver.findElement(By.xpath("//input[@id='search_query_top' or @name='search']")).sendKeys("T-shirts");
		
		//xpath with AND operator
		//driver.findElement(By.xpath("//input[@id='search_query_top' and @name='search_query']")).sendKeys("T-shirts");
	
		//xpath with contains() method
		//driver.findElement(By.xpath("//input[contains(@id,'search_query')]")).sendKeys("T-shirts");
	
		//xpath with starts-with() method
		driver.findElement(By.xpath("//input[starts-with(@id,'search_query')]")).sendKeys("T-shirts");
	
	}

}

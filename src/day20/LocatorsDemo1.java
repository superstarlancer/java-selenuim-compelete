package day20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php"); //maximize the browser window
		
		driver.findElement(By.id("search_query_top")).sendKeys("T-shirts"); //id
		driver.findElement(By.name("submit_search")).click();
		
		//driver.findElement(By.linkText("Printed Chiffon Dress")).click(); //link text only for links
		driver.findElement(By.partialLinkText("Printed ")).click(); //partialLinkText pass a portion of the value
		
		

	}

}

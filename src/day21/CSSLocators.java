package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		//css with tag and ID
		//driver.findElement(By.cssSelector("input#search_query_top")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector("#search_query_top")).sendKeys("T-Shirts");
		
		//css with tag and class .dot
		driver.findElement(By.cssSelector(".search_query")).sendKeys("T-Shirts");

	}

}

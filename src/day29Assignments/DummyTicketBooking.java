package day29Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyTicketBooking {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		//Requirements
		
		//fill out first 5 items by using element id
		
		driver.findElement(By.id("product_550")).click(); //$15 option radio button
		driver.findElement(By.id("travname")).sendKeys("John"); //first name
		driver.findElement(By.id("travlastname")).sendKeys("Doe"); //last name
		driver.findElement(By.id("order_comments")).sendKeys("Test Comments"); //order notes
		
		//enter the date of birth using MM/DD/YY format using xpath
		//the date is a date picker so we have to pass ENTER key to actually place the value in the input box
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("10/09/1998"+Keys.ENTER);
		
		driver.findElement(By.id("sex_2")).click(); //choose female
		driver.findElement(By.xpath("//input[@id='addmorepax']")).click();
		driver.findElement(By.id("traveltype_2")).click();
		
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();


	}

}

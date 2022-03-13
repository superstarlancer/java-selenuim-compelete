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
		
		driver.findElement(By.name("fromcity")).sendKeys("Hyderabad"); //From city / Origin
		driver.findElement(By.name("tocity")).sendKeys("Delhi"); //To city. /Destination 
		
		driver.findElement(By.xpath("//input[@id='departon']")).sendKeys("10/03/2022"+Keys.ENTER); //Departure date  DD/MM/YYYY
		driver.findElement(By.xpath("//input[@id='returndate']")).sendKeys("15/03/2022"+Keys.ENTER); //Return date DD/MM/YYYY
		
		//Delivery options
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Visa Extension"+Keys.ENTER);
		
		//How will you like to receive the dummy ticket (optional)
		driver.findElement(By.xpath("//input[@id='deliverymethod_2']")).click(); //WhatsApp
				
					
		//Billing Details:
	
		driver.findElement(By.name("billname")).sendKeys("John");
		driver.findElement(By.name("billing_phone")).sendKeys("703-789-5417");
		driver.findElement(By.name("billing_email")).sendKeys("abcd@gmail.com");
		
		driver.findElement(By.xpath("//span[@id='select2-billing_country-container']")).click(); //Boostrap DropDown
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("India"+Keys.ENTER); //Country
		
		//Street address 
		driver.findElement(By.name("billing_address_1")).sendKeys("13646 ABC");
		driver.findElement(By.name("billing_address_2")).sendKeys("ABC");
		driver.findElement(By.name("billing_city")).sendKeys("HYD");
		
		//State selection 
		driver.findElement(By.xpath("//span[@id='select2-billing_state-container']")).click(); //Boostrap DropDown
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Telangana"+Keys.ENTER); //state
				
		driver.findElement(By.id("billing_postcode")).sendKeys("500090"); //Pin
		
		
		
		
		Thread.sleep(2000);
		driver.quit();


	}

}

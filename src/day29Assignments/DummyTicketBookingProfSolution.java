package day29Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummyTicketBookingProfSolution {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("product_550")).click(); // 990
		driver.findElement(By.id("travname")).sendKeys("John"); //First Given name
		driver.findElement(By.id("travlastname")).sendKeys("Kenedy"); //Last Surname (optional)
		driver.findElement(By.id("order_comments")).sendKeys("Testing"); //order_comments
		
		driver.findElement(By.xpath("//input[@id='dob']")).sendKeys("05/07/1985"+Keys.ENTER); // DD/MM/YYYY
				
		driver.findElement(By.id("sex_2")).click(); //Sex
		
		driver.findElement(By.id("traveltype_2")).click();  // Round Trip
		
		driver.findElement(By.name("fromcity")).sendKeys("Hyderabad"); //From city / Origin
		driver.findElement(By.name("tocity")).sendKeys("Delhi"); //To city. /Destination 
		
		driver.findElement(By.xpath("//input[@id='departon']")).sendKeys("10/03/2022"+Keys.ENTER); //Departure date  DD/MM/YYYY
		driver.findElement(By.xpath("//input[@id='returndate']")).sendKeys("15/03/2022"+Keys.ENTER); //Return date DD/MM/YYYY
				
		//Delivery options:
		
		//What is the dummy ticket for...? //Boostrap DropDown
		driver.findElement(By.xpath("//span[@id='select2-reasondummy-container']")).click();
		driver.findElement(By.xpath("//input[@role='combobox']")).sendKeys("Visa extension"+Keys.ENTER);
				
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

	}

}

package day37;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
	}
	
	@Test(dataProvider="dp")
	void testLogin(String user, String pwd)
	{
		driver.get("https://demo.nopcommerce.com/login");
		driver.findElement(By.id("Email")).sendKeys(user);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_title="nopCommerce demo store";
		String act_title=driver.getTitle();
		
		Assert.assertEquals(exp_title, act_title); 
	}
			
	@DataProvider(name="dp", indices= {0,2}) //not a range, you specify which get executed exactly
	String [][] loginData()
	{
		String data[][]= { 
				{"pavanoltraining@gmail.com","test123"},
				{"pavanol@gmail.com","test@123"},
				{"pavanoltraining@gmail.com","test3"},
				{"pavanoltraining@gmail.com","test@123"},
				{"pavanoltraining@gmail.com","test@123"}
			};
		return data;
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	

}
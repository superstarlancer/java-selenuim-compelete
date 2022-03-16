package day35;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase 
{
	
	WebDriver driver; //global variable , defining type and instantiating
	
	@Test(priority=1)
	void openApp() 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.get(" https://demo.nopcommerce.com/login");
	} 
	
	@Test(priority=3)
	void Login() 
	{
		WebElement emailtxt=driver.findElement(By.xpath("//inout[@id='Email']"));
		emailtxt.clear();
		emailtxt.sendKeys("admin@yourstore.com");
		
		WebElement passtxt=driver.findElement(By.xpath("//input[@id='Password']"));
		passtxt.clear();
		passtxt.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		String exp_lbl=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		
		
		/*if(exp_lbl.equals("Dqashboard"))
		{
			System.out.println("test passed");
		}
		else 
		{
			System.out.println("test failed");
		}*/
		
		//assertions
		Assert.assertEquals(exp_lbl, "Dashboard");
		
		
	}  
	
	@Test(priority=2)
	void closeApp() 
	{
		driver.close();
	}  
  
}

package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase 
{
	
	WebDriver driver;

	@Test(priority=1)
	void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login");
	}
	
	@Test(priority=2)
	void login()
	{
		WebElement emailtxt=driver.findElement(By.xpath("//input[@id='Email']"));
		emailtxt.clear();
		emailtxt.sendKeys("admin@yourstore.com");
		
		WebElement passtxt=driver.findElement(By.xpath("//input[@id='Password']"));
		passtxt.clear();
		passtxt.sendKeys("admin");
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		String exp_lbl=driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		
		/*if(exp_lbl.equals("Dashboards"))
		{
			System.out.println("test passed");
						
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		Assert.assertEquals(exp_lbl, "Dashboard","Labels are not equal..");
	
	
	}
	
	@Test(priority=3)
	void closeApp()
	{
		driver.close();
	}
}

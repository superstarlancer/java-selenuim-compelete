package day40_pageobjectmodel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class OrangeHrmTest 
{
	
	WebDriver driver;
	LoginPage2 lp; //object so we can access all methods in LoginPage
	
	@BeforeClass
	void setUp() 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	@Test(priority=1)
	void test_logo()
	{
		lp= new LoginPage2(driver); //invoking constructor by passing driver instance in lp object of LoginPage, need object to access all action methods in LoginPage.java
		Assert.assertEquals(lp.checkLogoPresence(), true); //if presence true and equal our true condition test will pass
	}
	
	
	//calling action methods from page object class in test methods
	@Test(priority=2)
	void test_login()
	{
		lp.setUserName("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
	
	
}

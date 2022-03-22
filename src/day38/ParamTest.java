package day38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamTest 
{

	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeClass
	void setup(String br,String appurl) throws InterruptedException
	{
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chromedriver","/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		}
		else if(br.equals("edge"))
		{
			System.setProperty("webdriver.msedgedriver", "/usr/local/bin/msedgedriver");
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.geckodriver","/usr/local/bin/firefoxdriver");
			driver=new FirefoxDriver();	
		}
			 
		driver.get(appurl);
		Thread.sleep(5000);
	}
	
	@Test(priority=1)
	void testLogo()
	{
		try
		{
		WebElement logo=driver.findElement(By.xpath("//div[@id='divLogo']//img"));
		Assert.assertEquals(logo.isDisplayed(),true); //returns true or false
		}
		catch(Exception e) //if false will throw exception and fail method
		{
			Assert.fail();
		}
	}
	
	@Test(priority=2)
	void testTitle()
	{
		Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are not equal");
		
	}
	
	@AfterClass
	void tearDown()
	{
	driver.quit();
	}
}

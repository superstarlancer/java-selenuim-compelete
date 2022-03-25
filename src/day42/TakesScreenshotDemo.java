package day42;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TakesScreenshotDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	
	//screenshot of full page
	@Test(priority=1)
	void fullpagescreenshot() throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE); //this is where file or screenshot is saved in memory in a src variable
		File trg=new File(System.getProperty("user.dir")+"/screenshots/homepage.png"); //user.dir gives you dynamic project location don't hard code the path
		FileUtils.copyFile(src, trg); //location where we will save file
	}
	
	@Test(priority=2)
	void specificElementScreenshot() throws IOException
	{
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		File src=logo.getScreenshotAs(OutputType.FILE);
		File trg=new File(System.getProperty("user.dir")+"/screenshots/logo.png");
		FileUtils.copyFile(src, trg);
		
	}
	
	
	@Test(priority=3)
	void specificSectionScreenshot() throws IOException
	{
		WebElement featureproductsSection=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']//div[@class='item-grid']"));
		File src=featureproductsSection.getScreenshotAs(OutputType.FILE); //this is where file or screenshot is saved in memory in a src variable
		File trg=new File(System.getProperty("user.dir")+"/screenshots/featureproducts.png"); //location where we will save file
		FileUtils.copyFile(src, trg);
		
	}
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
	
}

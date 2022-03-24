package day41;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class HeadlessModeTesting 
{

		@Test
		void headlessChrome()
		{
			ChromeOptions options=new ChromeOptions();
			options.setHeadless(true);
				
			System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
			WebDriver driver=new ChromeDriver(options);
			
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		
		
		@Test
		void headlessEdge()
		{
			EdgeOptions options=new EdgeOptions();
			options.setHeadless(true);
				
			System.setProperty("webdriver.edge.driver", "/usr/local/bin/msedgedriver");
			WebDriver driver=new EdgeDriver(options);
			
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
		
		
		@Test
		void headlessFirefox()
		{
			FirefoxOptions options=new FirefoxOptions();
			options.setHeadless(true);
				
			System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
			WebDriver driver=new FirefoxDriver(options); 
			
			
			driver.get("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
		}
}

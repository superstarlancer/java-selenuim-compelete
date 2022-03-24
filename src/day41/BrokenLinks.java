package day41;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinks 
{
	WebDriver driver;
	
	@BeforeClass
	void setUp() 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.deadlinkcity.com/");
	}
	
	@Test
	void testBrokenLinks() 
	{
		//step1 capture all the links
		//step2 capture href attribute value of all links
		//step3 if href attribtue does not have value then ignore it
		//step 4 if href attribute has value then connect to the server using the value(url) convert url format
		//step 5 if error code <400 not broken link, if error code >=400 broken link
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links are:+" +links.size());
		
		for(WebElement element:links) 
		{
			String url=element.getAttribute("href"); //gives you href attribute of value in string format
		
			if(url == null || url.isEmpty()) 
			{
				System.out.println("Url is empty...");
				continue; //goes to next link if url is empty
			}
			
			URL link= new URL(url);
			HttpURLConnection httpConn= (HttpURLConnection)link.openConnection(); //create an object and take link object to change http connection and return it
			httpConn.connect(); //connect to server
			
			if(httpConn.getResponseCode()>=400) 
			{
				System.out.println("url"+ "is a broken link");
			}
		
		
		}
	}
	
}

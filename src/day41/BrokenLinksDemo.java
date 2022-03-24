package day41;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BrokenLinksDemo {

	WebDriver driver;
	
	@BeforeClass
	void setup()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void testBrokenLinks() throws MalformedURLException 
	{
		//step1 capture all the links
		//step2 capture href attribute value of all links
		//step3 if href attribtue does not have value then ignore it
		//step 4 if href attribute has value then connect to the server using the value(url) convert url format
		//step 5 if error code <400 not broken link, if error code >=400 broken link
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total links are:"+links.size());
		
		int brokenlinks=0;
		
		for(WebElement element:links)
		{
			String url=element.getAttribute("href"); //gives you href attribute of value in string format
						
			if(url == null || url.isEmpty())
			{
				System.out.println("URL is empty..");
				continue;  //goes to next link if url is empty
			}
			
			URL link= new URL(url);
			
			try
			{
				HttpURLConnection httpConn=(HttpURLConnection)link.openConnection(); //create an object and take link object to change http connection and return it
				httpConn.connect(); // connect to server
				
				if(httpConn.getResponseCode()>=400)
				{
					System.out.println(httpConn.getResponseCode()+url+" --- is broken link");
					brokenlinks++;
				}
				else
				{
					System.out.println(httpConn.getResponseCode()+" url "+" -- is Not broken link");
				}
			}
			catch(Exception e) {
				
			}
			
		}
		
		System.out.println("Number of broken links:"+brokenlinks );
		
	}
	
	
	@AfterClass
	void tearDown()
	{
		driver.quit();
	}
}



package day41;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CookiesDemo 
{
	WebDriver driver;
	@BeforeClass
	void setUp() 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
	}
	
	@Test
	void testCookies() 
	{
		//How to capture cookies from browser?
		Set<Cookie> cookies=driver.manage().getCookies();
		System.out.println("Size of cookies:\s"+cookies.size());
		
		for(Cookie c:cookies) 
		{
			System.out.println(c.getName()+"     "+c.getValue());
		}
		
		//How to add cookie to the browser
		//now we'll have 4 cookies instead of 3
		Cookie cookieobj=new Cookie("Mycookie", "123456"); //this adds cookie to the browser name and value
		driver.manage().addCookie(cookieobj);
		
		cookies=driver.manage().getCookies(); //return type not required Set<Cookie>
		System.out.println("Size of cookies after adding new one:\s"+cookies.size());
		
		//delete a specific cookie from browser
		driver.manage().deleteCookie(cookieobj); //this is the only cookie object we have added
		cookies=driver.manage().getCookies(); //return type not required Set<Cookie>
		System.out.println("Size of cookies after deleting of new one:\s"+cookies.size());
		
		//How to delete all cookies
		driver.manage().deleteAllCookies(); //we usually use this in the beginning of the code
		cookies=driver.manage().getCookies(); //return type not required Set<Cookie>
		System.out.println("Size of cookies after deleting all:\s"+cookies.size());
	
	}

	@AfterClass
	void tearDown() 
	{
		driver.quit();
	}
}

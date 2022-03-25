package day42;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReadingPropertiesFile {

	String url,user,pwd;
	WebDriver driver;
	
	
	@BeforeClass
	void readPropertiesfile() throws IOException
	{
		//Approach 1
		/*FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/resources/application.properties"); // opening file in reading mode
		 
		Properties pro=new Properties();
		pro.load(file);  // loading file
		
		url=pro.getProperty("url");
		user=pro.getProperty("useremail");
		pwd=pro.getProperty("userpassword");*/
		
		//Approach 2
		ResourceBundle rb=ResourceBundle.getBundle("application");
		url=rb.getString("url");
		user=rb.getString("useremail");
		pwd=rb.getString("userpassword");
			
	}
	
	@Test
	void loginTest()
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		driver = new ChromeDriver(); 
		
		driver.get(url);
		
		WebElement emailtxt=driver.findElement(By.name("Email"));
		emailtxt.clear();
		emailtxt.sendKeys(user);
		
		WebElement passwordtxt=driver.findElement(By.name("Password"));
		passwordtxt.clear();
		passwordtxt.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[normalize-space()='Log in']")).click();
		
		//validation
	}
	
	@AfterTest
	void tearDown()
	{
		driver.quit();
	}
	
}

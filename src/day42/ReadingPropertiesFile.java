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
import org.testng.annotations.Test;

public class ReadingPropertiesFile 
{
	
	String url,user,pwd;
	
	//Approach 1
	@Test
	void readPropertiesfile() throws IOException 
	{
		//here we open file in read mode maybe change resources to config wasn't sure
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"\\resources\\application.properties"); //system.getProperty opens a file in a reading mode
		
		//here we load the file
		Properties pro=new Properties();
		pro.load(file);
		
		//read data from property file
		url=pro.getProperty("url"); //variable from the applicationproperties file in the resources folder
		user=pro.getProperty("useremail"); //variable from the applicationproperties file in the resources folder
		pwd=pro.getProperty("userpassword"); //variable from the applicationproperties file in the resources folder
	
		
	//Approach 2
	//don't need to directly open or load file ResourceBundle does the work
	ResourceBundle rb=ResourceBundle.getBundle("application"); //don't need to specify folder location or file name
	url=rb.getString("url"); //returns url
	user=rb.getString("useremail"); //returns email
	pwd=rb.getString("userpassword"); //returns password
		
	}
	
	//here statements read data from the file
	@Test
	void loginTest() 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.get(url);
		
		WebElement emailtxt=driver.findElement(By.name("Email"));
		emailtxt.clear();
		emailtxt.sendKeys(user);
		
		WebElement passwordtxt=driver.findElement(By.name("Password"));
		passwordtxt.clear();
		passwordtxt.sendKeys(user);
		
		driver.findElement(By.xpath("//button[normalize-space()= 'Log in']")).click();
	}
	
	
	
}

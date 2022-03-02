package day23;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCommands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // open URL on the browser
		driver.manage().window().maximize();
		
		System.out.println("Title:\s"+driver.getTitle()); //returns title of the webpage
		System.out.println("Current URL is:\s"+driver.getCurrentUrl()); //returns current url of the webpage
		
		//System.out.println("Page Source is ========>\s"+driver.getPageSource()); //returns page source
		
		String windowID=driver.getWindowHandle(); //returns single browser window ID
		System.out.println("Browser Window ID:\s"+windowID); //string format is returned
		
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIDs=driver.getWindowHandles(); //returns multiple browser window ID's
		
		for(String window:windowIDs) 
		{
			System.out.println(window);
		}
		
		
		System.out.println();
		
		
		driver.quit();
		
		

	}
}

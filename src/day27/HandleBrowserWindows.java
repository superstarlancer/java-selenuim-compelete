package day27;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//we need id of our browser window
		//driver.getWindowHandle(); //single browser id
		//System.out.println("Id of browser window:\s"+driver.getWindowHandle());

		
		
		//CDwindow-1BC1D7122F2479950894891C0850ED77
		//CDwindow-021DA080C897FC108066D59A998E4352
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		
		Set<String> windowIds=driver.getWindowHandles();
		
		//Approach 1
		//Set collection don't have a get method, we can convert set collection to list collection
		//List collection does have a get method
		//create list type of variable then create a list object
		//list is an interface, which class is implemented?arraylist
		/*List<String>windowIDslist=new ArrayList(windowIds); //convert set to list collection
		

		String parentWindowID=windowIDslist.get(0);
		String childWindowID=windowIDslist.get(1);
		
		driver.switchTo().window(childWindowID);
		System.out.println("child window title:\s"+driver.getTitle());
		
		driver.switchTo().window(parentWindowID);
		System.out.println("parent window title:\s"+driver.getTitle());*/
		
		//Approach 2
		//using looping statement
		/*for(String windowid:windowIds) 
		{
			String title=driver.switchTo().window(windowid).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS")) 
			{
				//perform operations on 2nd browser window
				driver.findElement(By.xpath("//a[normalize-space()='Contact Sales']")).click();
			}
		
		}*/
		
		
		//close single browser window
		for(String windowid:windowIds) 
		{
			String title=driver.switchTo().window(windowid).getTitle();
			if(title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS") || title.equals("xyz")) 
			{
				driver.close();
			}
		
		}
		
		
	}

}

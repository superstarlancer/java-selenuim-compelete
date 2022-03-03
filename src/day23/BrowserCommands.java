package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // open URL on the browser
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //opens another browser window
		//driver.close(); //closes only 1 browser window at the time, closes the first one opened
		driver.quit(); //closes multiple browser windows
	}

}

package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.snapdeal.com");
		driver.navigate().to("https://www.amazon.com");
		
		driver.navigate().back(); //snapdeal
		driver.navigate().forward(); //amazon
		
		driver.navigate().refresh();

	}

}

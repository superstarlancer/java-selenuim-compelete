package day30;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://demo.nopcommerce.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB); //specify if you want a new tab to be opened
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://orangehrm.com/");
		
		
		
		
		
		Thread.sleep(3000);
		driver.quit();

	}

}

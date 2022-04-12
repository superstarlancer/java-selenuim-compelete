package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		int noOfFrames=driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames:\s"+noOfFrames);
		 
		
		//to enter frame, add the methods below first
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click(); //1st frame
		driver.switchTo().defaultContent(); //go back to main page
		
		//to enter frame, add the methods below first
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("WebDriver")).click(); //2nd frame
		driver.switchTo().defaultContent(); //go back to main page
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Help']")).click(); // 3rd frame
		
		
		

	}

}

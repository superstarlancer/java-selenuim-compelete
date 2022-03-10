package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationOfElements {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		
		Point loc=driver.findElement(By.xpath("//div[@id='divLogo']//img")).getLocation(); //loc var will be able to return x and y axis from loc
		
		//two ways to print out coordinates
		System.out.println(loc); //(482,75)
		
		System.out.println(loc.getX());//returns x axis //482
		System.out.println(loc.getY());//returns y axis //75
		
		driver.quit();
	}

}

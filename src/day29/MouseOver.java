package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		WebElement desktop=driver.findElement(By.linkText("Desktops"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		//Mouse Hover
		//whenever we create an actions class object we have to pass the driver 
		Actions act=new Actions(driver); //act is an object //build() creates an action and perform() completes it
		act.moveToElement(desktop).moveToElement(mac).click().build().perform(); //this command moves to desktop element

	}

}

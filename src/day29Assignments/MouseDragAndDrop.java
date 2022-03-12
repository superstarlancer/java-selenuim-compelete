package day29Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();
		
		//here we switch to a frame and find the frame element via xpath class to enter it
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		//here we will capture 2 picture elements and save them using variables
		//can use this xpath //ul[@id='gallery']/li[1] //ul[@id='gallery']/li[2]
		WebElement ele1 = driver.findElement(By.xpath("//li[1]"));
		WebElement ele2 = driver.findElement(By.xpath("//li[2]"));
		
		
		//here we will capture the trash element in a variable via xpath
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		
		//Actions is a class, we use class object to access all methods to perform mouse operations, right click, double click, drag and drop
		Actions act= new Actions(driver);
		
		//perform mouse drag and drop
		act.dragAndDrop(ele1, trash).perform();
		act.dragAndDrop(ele2, trash).perform();
		
				
		Thread.sleep(2000);
		driver.quit();
		
		
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}

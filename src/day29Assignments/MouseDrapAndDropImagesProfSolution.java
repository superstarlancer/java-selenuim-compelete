package day29Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDrapAndDropImagesProfSolution {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
		WebDriver driver = new ChromeDriver(); 
				
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.manage().window().maximize();

		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement item1 = driver.findElement(By.xpath("//ul[@id='gallery']/li[1]"));
		WebElement item2 = driver.findElement(By.xpath("//ul[@id='gallery']/li[2]"));
		
		WebElement trash = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		//Moving both of them into trash
		act.dragAndDrop(item1, trash).perform();
		act.dragAndDrop(item2, trash).perform();
		
		Thread.sleep(2000);
		driver.quit();

	}

}

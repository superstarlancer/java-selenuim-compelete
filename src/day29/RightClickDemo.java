package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		//capture web element in a variable
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		//right click operation
		Actions act=new Actions(driver);
		act.contextClick(button).build().perform(); //right click ->build() builds action and perform completed the action;

		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();//copy
		
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); //closes alert pop-up box
		
	}

}

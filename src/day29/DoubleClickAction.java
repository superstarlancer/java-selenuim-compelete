package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAction {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		//capture field1
		driver.switchTo().frame("iframeResult"); //switch to frame
		WebElement field1=driver.findElement(By.id("field1")); //capture field 1
		field1.clear(); //clears the value
		field1.sendKeys("welcome"); //pass the value
		
		//double click copy button
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		Actions act=new Actions(driver);
		act.doubleClick(button).perform();  //double click action
		
		//capture text from field2 for validation purposes
		String value=driver.findElement(By.xpath("//input[@id='field2']")).getAttribute("value");
		
		
		//validate if text values are the same 
		if(value.equals("welcome")) 
		{
			System.out.println("Text is the same");
		}
		else 
		{
			System.out.println("Text is not same");
		}
		
		driver.quit();
		
	}

}

package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardOpeationsDemo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://text-compare.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='inputText1']")).sendKeys("Welcome to Selenium");
		Actions act=new Actions(driver);
		
		//CTRL+A - select the text
		act.keyDown(Keys.COMMAND).sendKeys("a").keyUp(Keys.COMMAND).perform(); //Press CMMD enter a and then release so keyUp
		
		//CTRL+C - copy text
		act.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).perform(); //Press CMMD enter c and then release so keyUp
		
		//Tab - navigates to the second box, no need to input xpath of other box
		act.sendKeys(Keys.TAB).perform(); //single key so we don't need keyUp and keyDown method
		
		//CTRL+V
		act.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).perform(); //Press CMMD enter v and then release so keyUp
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}

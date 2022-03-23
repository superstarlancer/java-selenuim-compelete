package day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsActionDemo {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chromedriver", "/usr/local/bin/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
	 	
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		//Right click operation
		Actions act=new Actions(driver);
		
		//act.contextClick(button).perform(); //right click
		//act.contextClick(button).perform().build(); //right click
		
		Action myaction=act.contextClick(button).build(); // here we are creating and storing an action into a variable
		myaction.perform(); // we are performing action which is created above.
	}

}
